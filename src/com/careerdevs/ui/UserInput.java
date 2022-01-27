package com.careerdevs.ui;

import java.util.InputMismatchException;
import java.util.Scanner;
// We declare it private; the scanner only needs to be used within this clas... not outside accessibility.

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String question) {
        System.out.print(question + "\nInput: ");
        return scanner.nextLine();
    }

    public static int readInt(String question) {
        while (true) {
            try {
                System.out.print(question + "\nNumber: ");
                return scanner.nextInt(); // exception risk

            } catch (InputMismatchException e) {
                System.out.println("You must enter an integer, try again");
                scanner.nextLine();
            }

        }
    }

}