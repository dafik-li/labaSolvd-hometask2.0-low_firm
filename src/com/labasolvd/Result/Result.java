package com.labasolvd.Result;


import com.labasolvd.Persons.SuspectedPersona;

import java.text.DecimalFormat;

public class Result {

    private Double resultYears;
    private SuspectedPersona suspectedPersona;


    public Result(Double resultYears, SuspectedPersona suspectedPersona) {
        this.resultYears = resultYears;
        this.suspectedPersona = suspectedPersona;
    }

    public Double getResultYears() {
        return resultYears;
    }

    public void setResultYears(Double resultYears) {
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
        return "Court decision: " + getResultYears() + "\n" + getSuspectedPersona();
    }
}
