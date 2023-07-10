package com.cabinvoice;

import java.util.Scanner;

public class MultipleRides {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    public double multipleRides(double distance1,double distance2,double distance3,double time1,double time2,double time3){

        double sum=cabInvoiceGenerator.calculateFare(distance1,time1)+cabInvoiceGenerator.calculateFare(distance2,time2)+cabInvoiceGenerator.calculateFare(distance3,time3);
        return sum/3;

    }

}
