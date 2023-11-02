package com.labasolvd;

public class Hooliganism extends Crime{

    protected String typeOfCrime = "Hooliganism";
    protected int termOfPunishment = 5;

    public Hooliganism(String typeOfCrime, int termOfPunishment) {
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

