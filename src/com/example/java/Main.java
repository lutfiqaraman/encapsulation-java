package com.example.java;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /* Generate a random number */
        Random num1 = new Random();
        int number1 = num1.nextInt(100) + 1;

        /* Generate a random number */
        Random num2 = new Random();
        int number2 = num2.nextInt(100) + 1;

        /* Print the numbers */
        Calculate.doPrintNumbers(number1,number2);

        /* adding two numbers */
        Calculate.Sum(number1, number2);

        /* Subtracting two numbers */
        Calculate.Subtraction(number1, number2);
        
        /* Multiplying two numbers */
        Calculate.Multiply(number1,number2);

        /* Dividing two numbers */
        Calculate.Divide(number1,number2);
        
    }

}
