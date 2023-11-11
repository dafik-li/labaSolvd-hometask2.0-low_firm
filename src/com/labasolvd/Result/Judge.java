package com.labasolvd.Result;

import com.labasolvd.Entity.Crimes.AbstractCrime;
import com.labasolvd.Entity.Crimes.CrimeInterface;
import com.labasolvd.Entity.Persons.ProsecutorPersona;
import com.labasolvd.Entity.Persons.SolicitorPersona;
import com.labasolvd.Entity.Persons.SuspectedPersona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Judge {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private final static Logger LOGGER = (Logger) LogManager.getLogger(Judge.class);
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
    public double exeCalc(SuspectedPersona suspectedPersona, AbstractCrime abstractCrime, SolicitorPersona solicitorPersona, ProsecutorPersona prosecutorPersona) {
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
    public double exeCalc(SolicitorPersona solicitorPersona, AbstractCrime abstractCrime) {
        double sum;

        sum = 1000 * solicitorPersona.getSolicitorLevel() * ((double) abstractCrime.getTermOfPunishment() / 5);
        return sum;
    }
    @Override
    public String toString() {
        return String.valueOf(sum);
    }
}
