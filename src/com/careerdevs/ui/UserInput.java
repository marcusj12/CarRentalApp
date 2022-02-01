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

    public static int readInt(String question, int min, int max) {
        while (true) {
            try {
                System.out.print(question);
                System.out.println("(" + min + " - " + max + "): ");

                int userInt = scanner.nextInt(); // checking for type; exception risk

                // make sure to clear system.in using the line agter taking in any data that is not a string
                scanner.nextLine();

                if (userInt >= min && userInt <= max) { //checking for valid range
                    return userInt;
                }
                // these lines will not run if a valid input is given
                System.out.println("Number must be in the range (" + min + " - " + max + ")");


            } catch (InputMismatchException e) {
                System.out.println("You must enter a whole number, try again");
                scanner.nextLine();

            } catch (Exception e) {
                System.out.println("An unknown error has occurred");
                System.out.println(e + "\n" + e.getMessage());
                return 0;
            }

        }
    }

}