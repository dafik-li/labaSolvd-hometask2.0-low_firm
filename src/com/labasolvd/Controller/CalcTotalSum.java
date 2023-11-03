package com.labasolvd.Controller;


public class CalcTotalSum {



    public double execute(int solicitorLevel, int yearsForPunishment) {


        double sum;


        sum = 1000 * solicitorLevel * ((double) yearsForPunishment / 5);
        return sum;
    }
}
