package com.careerdevs.classdemo1;

import com.careerdevs.ui.UserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(String question, int min, int max) { // Recursion; call readInt within itself.

        try {
            System.out.println(question);
            System.out.print("Number (" + min + " - " + max + "):");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            if (userInput >= min && userInput <= max) {
                return userInput;
            }
            System.out.println("Number Outside of the valid range, try again");
                return readInt(question, min, max);

        } catch (InputMismatchException exception) {
            System.out.println("Invalid Data Type");
            scanner.nextLine();
                return readInt(question, min, max);

        } catch (Exception exception) {
            System.out.println(exception.getClass());
            scanner.nextLine();
                return readInt(question,min,max);
        }
        }

        public static int altReadInt (String question, int min, int max) {
            System.out.println(question);
            System.out.print("Number (" + min + " - " + max + "):");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid Data Type");
                System.out.println(question);
                System.out.print("Number (" + min + " - " + max + "):");
                scanner.nextLine();
            }
            return scanner.nextInt();
        }
    }
