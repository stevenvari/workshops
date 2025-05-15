package com.pluralsight.model;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByYear(int min, int max){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByColor(String color){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByMileage(int min, int max){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByType(String type){
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return null;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
