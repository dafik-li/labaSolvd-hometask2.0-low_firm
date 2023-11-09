package com.labasolvd.Entity.Crimes;

abstract public class AbstractCrime implements CrimeInterface{
    protected String typeOfCrime;
    protected int termOfPunishment;

    @Override
    public String getTypeOfCrime() {
        return typeOfCrime;
    }
    @Override
    public void setTypeOfCrime(String typeOfCrime) {
        this.typeOfCrime = typeOfCrime;
    }
    @Override
    public int getTermOfPunishment() {
        return termOfPunishment;
    }
    @Override
    public void setTermOfPunishment(int termOfPunishment) {
        this.termOfPunishment = termOfPunishment;
    }
}
