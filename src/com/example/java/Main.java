package com.example.java;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random num1 = new Random();
        int number1 = num1.nextInt(100) + 1;

        Random num2 = new Random();
        int number2 = num2.nextInt(100) + 1;

        Calculate.doPrintNumbers(number1,number2);

        Calculate.Sum(number1, number2);

        Calculate.Subtraction(number1, number2);

        Calculate.Multiply(number1,number2);

        Calculate.Divide(number1,number2);
        
    }

}
