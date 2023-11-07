package com.labasolvd.Result;

import com.labasolvd.Crimes.AbstractCrime;
import com.labasolvd.Persons.ProsecutorPersona;
import com.labasolvd.Persons.SolicitorPersona;
import com.labasolvd.Persons.SuspectedPersona;
<<<<<<< HEAD

public class CourtSession {
=======
import com.labasolvd.Result.Result;

public class CourtSession {

>>>>>>> origin/main
    private Result result;
    private double sum;

    public CourtSession(Result result, double sum) {
        this.result = result;
        this.sum = sum;
    }
<<<<<<< HEAD
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

=======

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


    public double exeCalcResult(SuspectedPersona suspectedPersona, AbstractCrime abstractCrime, SolicitorPersona solicitorPersona, ProsecutorPersona prosecutorPersona) {

        double resultYears;
        double ratio;


>>>>>>> origin/main
        if (suspectedPersona.isWasArrestedBefore()) {
            ratio = 1.5;
        } else {
            ratio = 0.5;
        }
<<<<<<< HEAD
        resultYears = (ratio * abstractCrime.getTermOfPunishment()) / ((double) solicitorPersona.getSolicitorLevel() / prosecutorPersona.getProsecutorLevel());
        return resultYears;
    }
    public double exeCalc(SolicitorPersona solicitorPersona, AbstractCrime abstractCrime) throws Exception {
        double sum;

        sum = 1000 * solicitorPersona.getSolicitorLevel() * ((double) abstractCrime.getTermOfPunishment() / 5);
        return sum;
    }
    @Override
=======


        resultYears = (ratio * abstractCrime.getTermOfPunishment()) / ((double) solicitorPersona.getLevel() / prosecutorPersona.getLevel());
        return resultYears;
    }


    public double exeCalcSum(SolicitorPersona solicitorPersona, AbstractCrime abstractCrime) {

        double sum;


        sum = 1000 * solicitorPersona.getLevel() * ((double) abstractCrime.getTermOfPunishment() / 5);
        return sum;
    }


>>>>>>> origin/main
    public String toString() {
        return String.valueOf(sum);
    }
}
