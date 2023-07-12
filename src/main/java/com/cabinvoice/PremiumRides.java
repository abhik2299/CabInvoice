package com.cabinvoice;

public class PremiumRides {
    public static String ride = "normal";


    public double invoice(double distance, double time,String ride) {


        if (ride == "normal") {
            double costperkm = 10.0;
            double costpermin = 1.0;
            double minfare = 5.0;
            double totalfare = (distance * costperkm) + (time * costpermin);
            if (totalfare < 5) {
                return minfare;
            }
            return totalfare;
        } else {
            double costperkm = 15.0;
            double costpermin = 2.0;
            double minfare = 20.0;
            double totalfare = (distance * costperkm) + (time * costpermin);
            if (totalfare < 20) {
                return minfare;
            }
            return totalfare;


        }
    }

}
