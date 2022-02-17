package com.careerdevs.classdemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalService {

    private static ArrayList<Car> carStorage;


    public static void main (String[] args) {
//        int testInt = UI.readInt("Enter a num", 1, 10);
//        System.out.println(testInt);


        initializeCarStorage();
        //carStorage.get(0).setRented(true);
        //carStorage.get(3).setRented(true);
        mainMenu();
        rentalMenu();


    }
    private static ArrayList<Car> filterCars (boolean filterRented) {

        ArrayList<Car> filteredCars = new ArrayList<>();
            for (int i = 0; i < carStorage.size(); i++) {

                boolean keepCar = carStorage.get(i).isRented();

                if (filterRented) keepCar = !keepCar;

                if (keepCar) {
                    filteredCars.add(carStorage.get(i));
                }
            }
            return filteredCars;
    }
// Return void because this output does not need to return data, but outputs data and helps guide the program to whats next
    public static void mainMenu () {
        System.out.println("-".repeat(2) + "MAIN MENU" + "-".repeat(2));

        System.out.println("1) Rent Car");
        System.out.println("2) Return Car");
        System.out.println("3) Exit");

        int userSelection = UI.readInt("Select a A Menu Option", 1, 3); // Used to read integer selction; create variable to store selction
        System.out.println(userSelection);
    // value we're testing against is userSelection..
        switch (userSelection) {
            case 1 -> rentalMenu();
            case 2 -> returnMenu();
            case 3 -> System.out.println("Thank you for using the Car Rental CLI..");
        }
    }

    private static void returnMenu() {
        // temp array
        ArrayList<Car> rentedCars = getRentedCars();

        System.out.println("Rented Cars");
        for (int i = 0; i <rentedCars.size(); i++) {
            String tempCarName = rentedCars.get(i).getName();
            System.out.println(i+1 + ") " + tempCarName);
        }

        int userCarSelection = UI.readInt("Enter a number to select the car you'd like to return", 1, 5);
        Car selectedCar = rentedCars.get(userCarSelection-1);
        mainMenu();
    }

    private static ArrayList<Car> getAvailableCars () {
        ArrayList<Car> availableCars = new ArrayList<>();
        for (Car car : carStorage) {
            if (!car.isRented()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    private static ArrayList<Car> getRentedCars () {
        ArrayList<Car> rentedCars = new ArrayList<>();
        for (Car car : carStorage) {
            if (car.isRented()) {
                rentedCars.add(car);
            }
        }
        return rentedCars;
    }

    private static void rentalMenu () {
        //System.out.println("\n Rental Menu\n");

        // Create temp array for just the available cars
        ArrayList<Car> availableCars = getAvailableCars();
        //Display available cars
        System.out.println("\nAvailable Cars:\n");

        for (int i = 0; i < availableCars.size(); i++) {
                System.out.println(i+1 + ") " + availableCars.get(i).getName());
        }
        // read user input
       int userSelection = UI.readInt("What vehicle would you like to rent?",1,availableCars.size());
        //inform the user of a successful rent
        System.out.println("You are renting" + availableCars.get(userSelection-1).getName());
        //updating the car rental status
        availableCars.get(userSelection -1).setRented(true);

        mainMenu();
    }

    private  static void initializeCarStorage () {
        carStorage = new ArrayList<>();

        Car car1 = new Car("Honda", "Accord", false);
        Car car2 = new Car("Chevy", "Cruze", false);
        Car car3 = new Car("Toyota","Corolla", false);
        Car car4 = new Car("Ford", "F150", false);
        Car car5 = new Car("Suburu","WRX", false);





        carStorage.addAll(List.of(new Car[]{car1, car2, car3, car4, car5}));
    }
}

