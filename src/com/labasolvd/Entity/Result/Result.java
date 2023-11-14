package com.labasolvd.Entity.Result;

import com.labasolvd.Entity.Persons.ProsecutorPerson;
import com.labasolvd.Entity.Persons.SolicitorPerson;
import com.labasolvd.Entity.Persons.SuspectedPerson;

import java.util.Objects;

public class Result {
    private double resultYears;
    private SuspectedPerson suspectedPerson;
    private SolicitorPerson solicitorPerson;
    private ProsecutorPerson prosecutorPerson;

    public Result(double resultYears, SuspectedPerson suspectedPerson, SolicitorPerson solicitorPerson, ProsecutorPerson prosecutorPerson) {
        this.resultYears = resultYears;
        this.suspectedPerson = suspectedPerson;
        this.solicitorPerson = solicitorPerson;
        this.prosecutorPerson = prosecutorPerson;
    }
    public double getResultYears() {
        return resultYears;
    }
    public void setResultYears(Double resultYears) {
        this.resultYears = resultYears;
    }
    public SuspectedPerson getSuspectedPersona() {
        return suspectedPerson;
    }
    public void setSuspectedPersona(SuspectedPerson suspectedPerson) {
        this.suspectedPerson = suspectedPerson;
    }
    public SolicitorPerson getSolicitorPersona() {
        return solicitorPerson;
    }
    public void setSolicitorPersona(SolicitorPerson solicitorPerson) {
        this.solicitorPerson = solicitorPerson;
    }
    public ProsecutorPerson getProsecutorPersona() {
        return prosecutorPerson;
    }
    public void setProsecutorPersona(ProsecutorPerson prosecutorPerson) {
        this.prosecutorPerson = prosecutorPerson;
    }
    @Override
    public String toString() {
        return "Court decision: " + getResultYears()  + " years" + "\n" + "\n" + "Prisoner:___________________" + "\n" + getSuspectedPersona() + "\n" + "\n" +
                "Solicitor:___________________" + "\n" + getSolicitorPersona() + "\n" + "\n" +
                "Prosecutor:___________________" + "\n" + getProsecutorPersona();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result)) return false;
        Result result = (Result) o;
        return Double.compare(result.getResultYears(), getResultYears()) == 0 &&
                suspectedPerson.equals(result.suspectedPerson) &&
                solicitorPerson.equals(result.solicitorPerson) &&
                prosecutorPerson.equals(result.prosecutorPerson);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getResultYears(), suspectedPerson, solicitorPerson, prosecutorPerson);
    }
}
