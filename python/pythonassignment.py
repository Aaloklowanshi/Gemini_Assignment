# 1. File Analysis: Count Words, Lines, and Characters

def analyze_file(file_path):
    try:
        with open(file_path, 'r') as file:
            lines = file.readlines()
            line_count = len(lines)
            word_count = sum(len(line.split()) for line in lines)
            char_count = sum(len(line) for line in lines)
        
        return {
            'lines': line_count,
            'words': word_count,
            'characters': char_count
        }
    except FileNotFoundError:
        print(f"Error: The file at '{file_path}' does not exist.")
        return None

# Example usage:
# file_path = input("Enter the file path: ")
# result = analyze_file(file_path)
# if result:
#     print(f"Lines: {result['lines']}, Words: {result['words']}, Characters: {result['characters']}")

# 2. Generate Fibonacci Sequence up to N and Find Primes

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

def fibonacci_primes(n):
    if n <= 0:
        return []
    
    fib_sequence = [0, 1]
    while True:
        next_fib = fib_sequence[-1] + fib_sequence[-2]
        if next_fib > n:
            break
        fib_sequence.append(next_fib)

    prime_fibs = [num for num in fib_sequence if is_prime(num)]
    return prime_fibs

# Example usage:
n = int(input("Enter a number: "))
print(f"Prime numbers in Fibonacci sequence up to {n}: {fibonacci_primes(n)}")

# 3. Find the Second Largest Number in a List

def second_largest(numbers):
    unique_numbers = list(set(numbers))
    if len(unique_numbers) < 2:
        return None
    unique_numbers.sort(reverse=True)
    return unique_numbers[1]

# Example usage:
# numbers = [int(x) for x in input("Enter numbers separated by spaces: ").split()]
# print(f"Second largest number: {second_largest(numbers)}")

# 4. Check If a String is a Valid Anagram

import re

def is_anagram(str1, str2):
    str1_cleaned = re.sub(r'[^a-zA-Z0-9]', '', str1).lower()
    str2_cleaned = re.sub(r'[^a-zA-Z0-9]', '', str2).lower()
    return sorted(str1_cleaned) == sorted(str2_cleaned)

# Example usage:
# str1 = input("Enter the first string: ")
# str2 = input("Enter the second string: ")
# print(f"Are the strings anagrams? {is_anagram(str1, str2)}")
