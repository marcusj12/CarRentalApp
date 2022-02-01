package com.careerdevs.ui;

import com.careerdevs.Car;

import java.util.ArrayList;

public class RentalServiceTwo {
    public static void main(String[] args) {
        Car car1 = new Car("Honda","Accord");
        Car car2 = new Car("Chevy","Cruze");
        Car car3 = new Car("Toyota","Camry");
        Car car4 = new Car("Lexus", "350");

        ArrayList<Car> availableCars = new ArrayList< >();
        ArrayList<Car> rentedCars  = new ArrayList<>();

        availableCars.add(car1);
        availableCars.add(car2);
        availableCars.add(car4);
        rentedCars.add(car3);

        System.out.println(" Select a available Car:");
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println("(" + (i+1) +") " + availableCars.get(i).getName());
        }
        UserInput.readInt("Input the Number of the Car available", 1,availableCars.size());

    }
    public static void mainMenu () {
        System.out.println("Main Menu:");
        System.out.println("1) Menu 1");
        System.out.println("2) Menu 2");
        System.out.println("3) Exit");

        int userSelection = UserInput.readInt("Select an Option", 1, 3);

        if (userSelection == 1) {
            //run menu 1
        } else if (userSelection == 2) {
            //run menu 2
        }
        System.out.println("Thank you for selecting a car with prestige rentals");
     }

}
