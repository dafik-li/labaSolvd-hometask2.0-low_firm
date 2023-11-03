package com.labasolvd;


public class Result {


    private double resultYears;
    private SuspectedPersona suspectedPersona;


    public Result(double resultYears, SuspectedPersona suspectedPersona) {
        this.resultYears = resultYears;
        this.suspectedPersona = suspectedPersona;
    }


    public double getResultYears() {
        return resultYears;
    }

    public void setResultYears(double resultYears) {
        this.resultYears = resultYears;
    }

    public SuspectedPersona getSuspectedPersona() {
        return suspectedPersona;
    }

    public void setSuspectedPersona(SuspectedPersona suspectedPersona) {
        this.suspectedPersona = suspectedPersona;
    }


    @Override
    public String toString() {
        return resultYears + "\n" + suspectedPersona.name + "\n" + suspectedPersona.surname;
    }
}
