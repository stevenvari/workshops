package com.pluralsight.data;


import com.pluralsight.model.Dealership;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    public Dealership getDealership() {
        // read inventory.csv file
        // read the first line which has the dealership data
        // take the line of dealership data and split by |
        // take each colum

        Dealership dealership = null;

        try {
            FileReader fileReader = new FileReader("data/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            String[] dealerShipFields = line.split("\\|");
            dealership = new Dealership(dealerShipFields[0],dealerShipFields[1],dealerShipFields[2]);

            while ((line = bufferedReader.readLine()) != null){

               // System.out.println(line);
            }

            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }


        return dealership;
    }

    public void saveDealership(Dealership dealership) {

    }
}
