# Simple Calculator App

A basic Java calculator that performs arithmetic operations on two numbers.

Features:

Addition (+)
Subtraction (-)
Multiplication (*)
Division (/)
Supports floating-point numbers

How It Works
The calculator takes a string input in the format "number operator number" (with spaces between each element) and returns the calculated result as a float.
Usage
Basic Example
javaSystem.out.println(calculator("12 + 3")); // Output: 15.0
Supported Operations
javacalculator("10 + 5");   // Returns 15.0
calculator("10 - 5");   // Returns 5.0
calculator("10 * 5");   // Returns 50.0
calculator("10 / 5");   // Returns 2.0
Input Format
The input string must follow this exact format:

"number operator number"
Spaces are required between the number, operator, and second number
Example: "12.5 + 7.3"

Requirements

Java 8 or higher
Input must contain exactly 3 elements separated by spaces

Running the Application

Compile the Java file:
bashjavac org/khanyi/Main.java

Run the application:
bashjava org.khanyi.Calculator


Code Structure

Main.java - Contains the main method and calculator function
calculator(String calc) - Static method that performs the calculation
Returns a float result for all operations

Limitations

Only supports two-number operations
Requires exact spacing in input format
No error handling for invalid inputs
Division by zero is not handled

Future Enhancements
Consider adding:

Error handling for invalid inputs
Support for multiple operations in sequence
Parentheses support for order of operations
More advanced mathematical functions
