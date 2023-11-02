package com.labasolvd;

public class Robbery extends Crime{

    protected String typeOfCrime = "Robbery";
    protected int termOfPunishment = 10;

    public Robbery(String typeOfCrime, int termOfPunishment) {
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
