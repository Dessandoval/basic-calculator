package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

    System.out.print("Enter number 1: ");
        int firstNumber = inputScanner.nextInt();

        // asking for second number input
        System.out.print("Enter number 2: ");
        int secondNumber = inputScanner.nextInt();

        // asking which calculations they want to use
        // possible calculations:
        // (A)dd
        // (S)ubtract
        // (M)ultiply
        // (D)ivide
        //Please select an option: M
        System.out.println("Possible calculations");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        //please select a option
        System.out.println("please select an option");
        int total = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber + " = " + total);




    }
}
