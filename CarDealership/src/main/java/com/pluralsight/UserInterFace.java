package com.pluralsight;

public class UserInterFace {
    Dealership dealership;

    public void display(){
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
        System.out.println(dealership);
    }
}
