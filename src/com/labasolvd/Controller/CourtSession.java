package com.labasolvd.Controller;

import com.labasolvd.Result.Result;

public class CourtSession {

    private Result result;
    private double sum;


    public CourtSession(Result result, double sum) {
        this.result = result;
        this.sum = sum;
    }


    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }


    public double exeCalcResult(boolean wasArrestedBefore, int solicitorLevel, int prosecutorLevel, int yearsForPunishment) {

        double resultYears;
        double ratio;


        if (wasArrestedBefore) {
            ratio = 1.5;
        } else {
            ratio = 0.5;
        }


        resultYears = (ratio * yearsForPunishment) / ((double) solicitorLevel / prosecutorLevel);
        return resultYears;
    }


    public double exeCalcSum(int solicitorLevel, int yearsForPunishment) {

        double sum;


        sum = 1000 * solicitorLevel * ((double) yearsForPunishment / 5);
        return sum;
    }


    public String toString() {
        return String.valueOf(sum);
    }
}
