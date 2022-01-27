package com.careerdevs;


public class RentalService {
    public static void main(String[] args) {
        System.out.println("Welcome to J's Car Rental App:");

        // 1. traditional / standard array
        // Create list/arr
        Car[] carStorage = new Car[3];

       // create obj instances
        Car car1 = new Car("Honda","Accord");
        Car car2 = new Car("Chevy","Tahoe");
        Car car3 = new Car("Toyota","Camry");

        //System.out.println(car1.getMake());

        // store obj instances in list/arr
        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;

        car2.setRented(true);
        //Problem: How do we list just rented/available cars?

        //Solution: (sts arr): itterate through the array, only display cars
        System.out.println("Available Cars:");
        int listNumber = 1;
        for (int i = 0; i< carStorage.length; i++) {
            if (!carStorage[i].isRented()) {
                System.out.println("(" + listNumber + ") " + carStorage[i].getName() );
                listNumber++;
            }

        }

//        System.out.println("All Cars:");
//        for (int i = 0; i< carStorage.length; i++) {
//            String carStatus;
//            if (!carStorage[i].isRented()) {
//                carStatus = "Available Cars";
//            }else {
//                carStatus = "Unavailable";
//            }
//            System.out.println("(" + (i+1) + ") " + carStorage[i].getName() + " (" + carStatus + ") ");
//            listNumber++;
//        }
//
    }
}
