package com.labasolvd.Result;

import com.labasolvd.Entity.Persons.ProsecutorPersona;
import com.labasolvd.Entity.Persons.SolicitorPersona;
import com.labasolvd.Entity.Persons.SuspectedPersona;

public class Result {
    private double resultYears;
    private SuspectedPersona suspectedPersona;
    private SolicitorPersona solicitorPersona;
    private ProsecutorPersona prosecutorPersona;

    public Result(double resultYears, SuspectedPersona suspectedPersona, SolicitorPersona solicitorPersona, ProsecutorPersona prosecutorPersona) {
        this.resultYears = resultYears;
        this.suspectedPersona = suspectedPersona;
        this.solicitorPersona = solicitorPersona;
        this.prosecutorPersona = prosecutorPersona;
    }
    public double getResultYears() {
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
