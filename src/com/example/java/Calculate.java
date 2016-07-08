package com.example.java;

class Calculate {

    static void doPrintNumbers(int n1, int n2) {
        System.out.println("The first number = " + n1);
        System.out.println("The second number = " + n2);
    }

    static void Sum(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("The result of adding the two numbers = " + Integer.toString(sum));
    }

    static void Subtraction(int n1, int n2) {
        int sub = n1 - n2;
        System.out.println("The result of subtract the two numbers = " + Integer.toString(sub));
    }

    static void Multiply(int n1, int n2) {
        int multiply = n1 * n2;
        System.out.println("The result of multiply the two numbers = " + Integer.toString(multiply));
    }

    static void Divide(int n1, int n2) {
        int divide = n1 / n2;
        System.out.println("The result of devide the two numbers = " + Integer.toString(divide));
    }


}
