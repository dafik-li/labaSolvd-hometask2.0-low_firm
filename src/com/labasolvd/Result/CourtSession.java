package com.labasolvd.Result;

import com.labasolvd.Crimes.AbstractCrime;
import com.labasolvd.Persons.ProsecutorPersona;
import com.labasolvd.Persons.SolicitorPersona;
import com.labasolvd.Persons.SuspectedPersona;

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
    public double exeCalc(SuspectedPersona suspectedPersona, AbstractCrime abstractCrime, SolicitorPersona solicitorPersona, ProsecutorPersona prosecutorPersona) throws Exception {
        double resultYears;
        double ratio;

        if (suspectedPersona.isWasArrestedBefore()) {
            ratio = 1.5;
        } else {
            ratio = 0.5;
        }
        resultYears = (ratio * abstractCrime.getTermOfPunishment()) / ((double) solicitorPersona.getSolicitorLevel() / prosecutorPersona.getProsecutorLevel());
        return resultYears;
    }
    public double exeCalc(SolicitorPersona solicitorPersona, AbstractCrime abstractCrime) throws Exception {
        double sum;

        sum = 1000 * solicitorPersona.getSolicitorLevel() * ((double) abstractCrime.getTermOfPunishment() / 5);
        return sum;
    }
    @Override
    public String toString() {
        return String.valueOf(sum);
    }
}
