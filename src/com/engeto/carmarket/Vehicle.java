package com.engeto.carmarket;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Vehicle {
//    String model = "Ford Perfect 107E";
//    LocalDate registrationDate = LocalDate.of(2010,11,10);
//    double averageConsumption = 8.35;
//    int previousOwners = 1;
//    String owner = "Karel Dvořák";
//    BigDecimal price = BigDecimal.valueOf(89_999.90);
//    boolean isReady = true;

String make;          // typ vozidla
int price;           //cena
boolean isAvailable; // v ponuke
double consuption;   // spotreba paliva
VehicleType  vehicleType;


    //region Constructor

    public Vehicle(String make, int price, boolean isAvailable, double consuption, VehicleType type) {
        this.make = make;
        this.price = price;
        this.isAvailable = isAvailable;
        this.consuption = consuption;
        this.vehicleType = type;
    }


    //endregion


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available){
        isAvailable = available;
    }

    public double getConsuption() {
        return consuption;
    }

    public void setConsuption(double consuption) {
        this.consuption = consuption;
    }

    // !!!!!!!!!  POZOR!!!!!!!!!!!!!!!!
    //   metody porovnanvaju ci su objecty rovnake aby ich mohol odstranit
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return price == vehicle.price &&
                isAvailable == vehicle.isAvailable &&
                Double.compare(vehicle.consuption, consuption) == 0 &&
                Objects.equals(make, vehicle.make) &&
                vehicleType == vehicle.vehicleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, price, isAvailable, consuption, vehicleType);
    }

}