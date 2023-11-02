package com.labasolvd;


public class Result {


    private double resultYears;
    private SuspectedPersona suspected;


    public Result(double resultYears, SuspectedPersona suspected) {
        this.resultYears = resultYears;
        this.suspected = suspected;
    }


    public double getResultYears() {
        return resultYears;
    }

    public void setResultYears(double resultYears) {
        this.resultYears = resultYears;
    }

    public SuspectedPersona getSuspected() {
        return suspected;
    }

    public void setSuspected(SuspectedPersona suspected) {
        this.suspected = suspected;
    }


    @Override
    public String toString() {
        return resultYears + "\n" + suspected.name + "\n" + suspected.surname;
    }
}
