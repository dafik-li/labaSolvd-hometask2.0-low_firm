package com.labasolvd;


public class CalcResult {



    public double execute(boolean wasArrestedBefore, int solicitorLevel, int prosecutorLevel, int yearsForPunishment) {


        double resultYears;
        double ratio;


        if (wasArrestedBefore) {
            ratio = 1.5;
        } else {
            ratio = 0.5;
        }


        resultYears = ratio * yearsForPunishment / ((double) solicitorLevel / prosecutorLevel);
        return resultYears;
    }
}
