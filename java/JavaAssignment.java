import java.util.Scanner;

public class JavaAssignment {

    public static void main(String[] args) {
        calculateMarks(); // Calculates total marks and percentage
        // calculateInterest(); // Calculates Simple and Compound Interest
        // calculateCircleProperties(); // Calculates area and circumference of a circle
        // convertTemperature(); // Converts temperature from Centigrade to Fahrenheit
        // swapValues(); // Swaps two variables
        // checkEquality(); // Checks if two numbers are equal
        // findGreatestOfThree(); // Finds the greatest of three numbers
        // checkEvenOdd(); // Checks if a number is even or odd
        // checkLeapYear(); // Checks if a year is a leap year
        // calculateGrade(); // Calculates grade based on percentage
        }

    // Method to calculate the total marks and percentage for 5 subjects
    public static void calculateMarks() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt(); // Reading marks for each subject
        }
        double percentage = (sum / 5.0); // Calculating percentage
        System.out.println("Total Marks: " + sum);
        System.out.println("Percentage: " + percentage + "%");
    }

    // Method to calculate Simple Interest and Compound Interest
    public static void calculateInterest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble(); // Principal amount
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble(); // Rate of interest
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble(); // Time in years

        double simpleInterest = (principal * rate * time) / 100; // Simple Interest formula
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal; // Compound Interest formula

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }

    // Method to calculate the area and circumference of a circle
    public static void calculateCircleProperties() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble(); // Radius of the circle

        double area = Math.PI * radius * radius; // Area formula
        double circumference = 2 * Math.PI * radius; // Circumference formula

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    // Method to convert temperature from Centigrade to Fahrenheit
    public static void convertTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Centigrade: ");
        double celsius = scanner.nextDouble(); // Temperature in Centigrade

        double fahrenheit = (celsius * 9 / 5) + 32; // Conversion formula

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    // Method to swap the values of two variables using a third variable
    public static void swapValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int first = scanner.nextInt(); // First variable
        System.out.print("Enter second value: ");
        int second = scanner.nextInt(); // Second variable

        int temp = first; // Temporary variable to hold the value of first
        first = second; // Assigning second to first
        second = temp; // Assigning temporary value to second

        System.out.println("After swapping, first value: " + first + ", second value: " + second);
    }

    // Method to check if two numbers are equal
    public static void checkEquality() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt(); // First number
        System.out.print("Enter second number: ");
        int second = scanner.nextInt(); // Second number

        if (first == second) { // Checking equality
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
    }

    // Method to find the greatest of three numbers
    public static void findGreatestOfThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt(); // First number
        System.out.print("Enter second number: ");
        int second = scanner.nextInt(); // Second number
        System.out.print("Enter third number: ");
        int third = scanner.nextInt(); // Third number

        int greatest = Math.max(first, Math.max(second, third)); // Finding the greatest number
        System.out.println("The greatest number is: " + greatest);
    }

    // Method to check if a number is even or odd
    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Input number

        if (number % 2 == 0) { // Checking divisibility by 2
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    // Method to check if a year is a leap year
    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt(); // Input year

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { // Leap year conditions
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }

    // Method to calculate grade based on percentage marks
    public static void calculateGrade() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt(); // Reading marks for each subject
        }
        double percentage = (sum / 5.0); // Calculating percentage

        if (percentage >= 90) { // Grade A
            System.out.println("Grade: A");
        } else if (percentage >= 80) { // Grade B
            System.out.println("Grade: B");
        } else if (percentage >= 60) { // Grade C
            System.out.println("Grade: C");
        } else { // Grade D
            System.out.println("Grade: D");
        }
    }
}
