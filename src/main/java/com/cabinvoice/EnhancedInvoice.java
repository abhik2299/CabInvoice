package com.cabinvoice;

public class EnhancedInvoice {
    CabInvoiceGenerator obj=new CabInvoiceGenerator();
    public double avgFare(double distance1,double distance2,double distance3,double time1,double time2,double time3){

        double sum=obj.calculateFare(distance1,time1)+obj.calculateFare(distance2,time2)+obj.calculateFare(distance3,time3);
        return sum/3;

    }

    public double totalFare(double distance1,double distance2,double distance3,double time1,double time2,double time3){

        double sum=obj.calculateFare(distance1,time1)+obj.calculateFare(distance2,time2)+obj.calculateFare(distance3,time3);
        return sum;

    }
    public int totalRide(){
        return 3;
    }


}
