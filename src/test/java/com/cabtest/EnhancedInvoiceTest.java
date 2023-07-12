package com.cabtest;

import com.cabinvoice.EnhancedInvoice;
import org.junit.Assert;
import org.junit.Test;

public class EnhancedInvoiceTest {
    EnhancedInvoice obj=new EnhancedInvoice();
    @Test
    public void testEnhanced(){
        double dis1=15;
        double dis2=5;
        double dis3=25;
        double time1=10;
        double time2=20;
        double time3=30;
        double result=obj.avgFare(dis1,dis2,dis3,time1,time2,time3);
        Assert.assertEquals(170,result,0);
    }
    @Test
    public void testEnhanced2(){
        double dis1=15;
        double dis2=5;
        double dis3=25;
        double time1=10;
        double time2=20;
        double time3=30;
        double result=obj.totalFare(dis1,dis2,dis3,time1,time2,time3);
        Assert.assertEquals(510,result,0);
    }


}
