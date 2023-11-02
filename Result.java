package com.labasolvd;

import java.util.Objects;

public class Result {

    private Solicitor solicitor;
    private Prosecutor prosecutor;
    private Suspected suspected;
    private Crime crime;
    private Homicide homicide;
    private Robbery robbery;
    private Hooliganism hooliganism;
    private double resultYears;


    public Result(double resultYears) {
        this.resultYears = resultYears;
    }


    public double getResultYears() {
        return resultYears;
    }

    public void setResultYears(double resultYears) {
        this.resultYears = resultYears;
    }

    public double calcResult() {

        double ratio;
        int yearsForPunishment = crime.termOfPunishment;
        String crimeName = crime.typeOfCrime;


        if (suspected.isWasConvicted()) {
            ratio = 1.5;
        } else {
            ratio = 0.5;
        }


        if (Objects.equals(crimeName, homicide.typeOfCrime)) {
            yearsForPunishment = homicide.termOfPunishment;
        } else if (Objects.equals(crimeName, robbery.typeOfCrime)) {
            yearsForPunishment = robbery.termOfPunishment;
        } else if (Objects.equals(crimeName, hooliganism.typeOfCrime)) {
            yearsForPunishment = hooliganism.termOfPunishment;
        }


        resultYears = ratio * yearsForPunishment / ((double) solicitor.getLevel() / prosecutor.getLevel());
        return resultYears;
    }

    @Override
    public String toString() {
        return String.valueOf(resultYears);
    }
}
