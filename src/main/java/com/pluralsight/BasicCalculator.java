package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

    System.out.print("Enter number 1: ");
        int firstNumber = inputScanner.nextInt();
        inputScanner.nextLine();

        // asking for second number input
        System.out.print("Enter number 2: ");
        int secondNumber = inputScanner.nextInt();
        inputScanner.nextLine();

        // asking which calculations they want to use : possible calculations:
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
        System.out.println("please select an option");

        //Please select an option: M
        String chosenOption = inputScanner.nextLine();
        System.out.println("You chose: " + chosenOption);

        int total = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber + " = " + total);




    }
}
