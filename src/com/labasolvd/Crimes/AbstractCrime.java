package com.labasolvd.Crimes;

abstract public class AbstractCrime {
    protected String typeOfCrime;
    protected int termOfPunishment;

    public String getTypeOfCrime() {
        return typeOfCrime;
    }
    public void setTypeOfCrime(String typeOfCrime) {
        this.typeOfCrime = typeOfCrime;
    }
    public int getTermOfPunishment() {
        return termOfPunishment;
    }
    public void setTermOfPunishment(int termOfPunishment) {
        this.termOfPunishment = termOfPunishment;
    }
}
