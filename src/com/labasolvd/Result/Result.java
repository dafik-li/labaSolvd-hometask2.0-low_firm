package com.labasolvd.Result;

import com.labasolvd.Persons.ProsecutorPersona;
import com.labasolvd.Persons.SolicitorPersona;
import com.labasolvd.Persons.SuspectedPersona;

import java.text.DecimalFormat;

public class Result {
<<<<<<< HEAD
    private double resultYears;
=======

    private Double resultYears;
>>>>>>> origin/main
    private SuspectedPersona suspectedPersona;
    private SolicitorPersona solicitorPersona;
    private ProsecutorPersona prosecutorPersona;

<<<<<<< HEAD
    public Result(double resultYears, SuspectedPersona suspectedPersona, SolicitorPersona solicitorPersona, ProsecutorPersona prosecutorPersona) {
=======

    public Result(Double resultYears, SuspectedPersona suspectedPersona) {
>>>>>>> origin/main
        this.resultYears = resultYears;
        this.suspectedPersona = suspectedPersona;
        this.solicitorPersona = solicitorPersona;
        this.prosecutorPersona = prosecutorPersona;
    }
<<<<<<< HEAD
    public double getResultYears() {
        return resultYears;
    }
=======

    public Double getResultYears() {
        return resultYears;
    }

>>>>>>> origin/main
    public void setResultYears(Double resultYears) {
        this.resultYears = resultYears;
    }
    public SuspectedPersona getSuspectedPersona() {
        return suspectedPersona;
    }
    public void setSuspectedPersona(SuspectedPersona suspectedPersona) {
        this.suspectedPersona = suspectedPersona;
    }
    public SolicitorPersona getSolicitorPersona() {
        return solicitorPersona;
    }
    public void setSolicitorPersona(SolicitorPersona solicitorPersona) {
        this.solicitorPersona = solicitorPersona;
    }
    public ProsecutorPersona getProsecutorPersona() {
        return prosecutorPersona;
    }
    public void setProsecutorPersona(ProsecutorPersona prosecutorPersona) {
        this.prosecutorPersona = prosecutorPersona;
    }
    @Override
    public String toString() {
        return "Court decision: " + getResultYears()  + " years" + "\n" + "\n" + "Prisoner:___________________" + "\n" + getSuspectedPersona() + "\n" + "\n" +
                "Solicitor:___________________" + "\n" + getSolicitorPersona() + "\n" + "\n" +
                "Prosecutor:___________________" + "\n" + getProsecutorPersona();
    }
}
