package com.cabtest;

import com.cabinvoice.PremiumRides;
import org.junit.Assert;
import org.junit.Test;

public class PremiumRidesTest {
    PremiumRides obj=new PremiumRides();
    @Test
    public void testPremiumRide(){
        String ride="Premium";
        double distance=20;
        double time=10;
        double result=obj.invoice(distance,time,ride);
        Assert.assertEquals(320,result,0);
    }
}
