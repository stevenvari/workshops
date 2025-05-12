package com.pluralsight;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    public Dealership getDealership() {
        // read inventory.csv file
        // read the first line which has the dealership data
        // take the line of dealership data and split by |
        // take each colum

        try {
            FileReader fileReader = new FileReader("data/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        Dealership dealership = new Dealership("", "", "");
        return dealership;
    }

    public void saveDealership(Dealership dealership) {

    }
}
