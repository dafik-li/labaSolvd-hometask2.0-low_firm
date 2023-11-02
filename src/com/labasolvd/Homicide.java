package com.labasolvd;

public class Homicide extends Crime{

    protected String typeOfCrime = "Homicide";
    protected int termOfPunishment = 20;


    public Homicide(String typeOfCrime, int termOfPunishment) {
        super(typeOfCrime, termOfPunishment);
    }

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
