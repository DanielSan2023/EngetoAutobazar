package com.engeto.carmarket;

import java.util.List;
import java.util.ArrayList;

public class VehicleOffer {
    // List to store vehicle offers
    List<Vehicle> offer = new ArrayList<>();

    // Method to add a new vehicle to the offer list
    public void addCar(Vehicle newVehicle) {
        offer.add(newVehicle);
    }

    // Method to remove a vehicle from the offer list
    public void removeCar(Vehicle vehicleToRemove) {
        offer.remove(vehicleToRemove);
    }

    /**
     * Return the number of cars currently in offer.
     *
     * @return number of cars in offer
     */
    public int numberOfCars() {
        return offer.size();
    }

    // Method to print details of all cars in the offer
    public void printAllCars() {
        for (Vehicle vehicle : offer) {
            // Print vehicle make and price
            System.out.println(
                    vehicle.getMake() + " (" + vehicle.getPrice() + ")");
        }
    }
}
