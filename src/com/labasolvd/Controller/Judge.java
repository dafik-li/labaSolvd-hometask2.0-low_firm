package com.labasolvd.Controller;

import com.labasolvd.Entity.Crimes.AbstractCrime;
import com.labasolvd.Entity.Persons.ProsecutorPerson;
import com.labasolvd.Entity.Persons.SolicitorPerson;
import com.labasolvd.Entity.Persons.SuspectedPerson;
import com.labasolvd.Entity.Result.Result;

public class Judge {
    private Result result;
    private double sum;

    public Judge(Result result, double sum) {
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
    public double exeCalc(SuspectedPerson suspectedPerson, AbstractCrime abstractCrime, SolicitorPerson solicitorPerson, ProsecutorPerson prosecutorPerson) {
        double resultYears;
        double ratio;

        if (suspectedPerson.isWasArrestedBefore()) {
            ratio = 1.5;
        } else {
            ratio = 0.5;
        }
        resultYears = (ratio * abstractCrime.getTermOfPunishment()) / ((double) solicitorPerson.getSolicitorLevel() / prosecutorPerson.getProsecutorLevel());
        return resultYears;
    }
    public double exeCalc(SolicitorPerson solicitorPerson, AbstractCrime abstractCrime) {
        double sum;

        sum = 1000 * solicitorPerson.getSolicitorLevel() * ((double) abstractCrime.getTermOfPunishment() / 5);
        return sum;
    }
    @Override
    public String toString() {
        return String.valueOf(sum);
    }
}
