🚀 Java Lambda Expression Example – Math Operations

This project demonstrates how to use Java 8 Lambda Expressions with a functional interface to perform simple math operations like addition and subtraction.

📌 What is a Lambda Expression?

A Lambda Expression is a short block of code that takes in parameters and returns a value.
It provides a clear and concise way to represent a method using ()-> {} syntax.

In Java, Lambda Expressions are often used with functional interfaces (interfaces with a single abstract method).

📝 Code Example
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaMath {
    public static void main(String[] args) {
        // Lambda for addition
        MathOperation add = (a, b) -> a + b;

        // Lambda for subtraction
        MathOperation sub = (a, b) -> a - b;

        // Direct usage
        System.out.println("Addition: " + add.operate(10, 5));      // 15
        System.out.println("Subtraction: " + sub.operate(10, 5));  // 5
    }
}

📊 Output
Addition: 15
Subtraction: 5

