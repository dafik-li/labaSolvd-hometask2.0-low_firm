package com.labasolvd;

abstract public class Crime {

    protected String typeOfCrime;
    protected int termOfPunishment;


    public Crime(String typeOfCrime, int termOfPunishment) {
        this.typeOfCrime = typeOfCrime;
        this.termOfPunishment = termOfPunishment;
    }


    abstract public String getTypeOfCrime();

    abstract public void setTypeOfCrime(String typeOfCrime);

    abstract public int getTermOfPunishment();

    abstract public void setTermOfPunishment(int termOfPunishment);
}
