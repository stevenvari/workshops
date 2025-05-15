package com.pluralsight.ui;

import com.pluralsight.data.DealershipFileManager;
import com.pluralsight.model.Dealership;
import com.pluralsight.model.Vehicle;

import java.util.ArrayList;

import java.util.Scanner;

public class UserInterFace {
    Dealership dealership;

    Scanner input = new Scanner(System.in);

    public void initialize(){
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();


    }

    public void display(){
        initialize();
        System.out.println("\n Main Menu");
        System.out.println("Press 1 to request Price Range");
        System.out.println("Press 2 to request Make & Model");
        System.out.println("Press 3 to request Year");
        System.out.println("Press 4 to request Color");
        System.out.println("Press 5 to request Mileage");
        System.out.println("Press 6 to request Vehicle Type");
        System.out.println("Press 7 to request All Vehicles");
        System.out.println("Press 8 to remove Vehicle");

        String selectMenuOption = input.nextLine();

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        switch (selectMenuOption) {
            case "1":
                System.out.println("Enter minimum price ");
                double min = input.nextDouble();
                System.out.println("Enter maximum price ");
                double max = input.nextDouble();
                vehicles = dealership.getVehiclesByPrice(min,max);
                break;

            case "2":
                System.out.println("Enter vehicle make: ");
                String make = input.nextLine();
                System.out.println("Enter vehicle model");
                String model = input.nextLine();
                dealership.getVehiclesByMakeModel(make,model);
                break;

            case "3":
                System.out.println("Enter minimun year: ");
                int minYear = input.nextInt();
                System.out.println("Enter maximum year: ");
                int maxYear = input.nextInt();
                dealership.getVehicleByYear(minYear,maxYear);
                break;

            case "4":
                System.out.println("Enter vehicle color: ");
                String vehicleColor = input.nextLine();
                dealership.getVehicleByColor(vehicleColor);
                break;

            case "5":
                System.out.println("Enter minimum mileage: ");
                int minMileage = input.nextInt();
                System.out.println("Enter maximum mileage: ");
                int maxMileage = input.nextInt();
                dealership.getVehicleByMileage(minMileage,maxMileage);
                break;

            case "6":
                System.out.println("Enter vehicle type: ");
                String vehicleType = input.nextLine();
                dealership.getVehicleByType(vehicleType);
                break;

            case "7":
                dealership.getAllVehicles();
                break;

            case "8":
                System.out.println("Enter the vehicle VIN to remove: ");
                int removeVehicleVinNUmber = input.nextInt();

                Vehicle vinToRemove = null;
                for (Vehicle vehicle : dealership.getAllVehicles()){
                    if (vehicle.getVin() == removeVehicleVinNUmber ) {
                        vinToRemove = vehicle;
                        break;
                    }
                }

                if (vinToRemove != null){
                    dealership.removeVehicle(vinToRemove);
                    System.out.println("vehicle removed." + "\nVehicle information: " + vinToRemove);
                }
                else {
                    System.out.println("vehicle not found");
                }
                break;

            default:
                System.out.println("Invalid menu option! Please try again!");
        }
        displayVehicles(vehicles);
    }
    public void displayVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

   public void processAllVehiclesRequest(){
       ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
       displayVehicles(vehicles);
   }
   }

