package com.labasolvd.Result;


public class TotalSum {


    private double sum;



    public TotalSum(double sum) {
        this.sum = sum;
    }


    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }



    public String toString() {
        return String.valueOf(sum);
    }
}
