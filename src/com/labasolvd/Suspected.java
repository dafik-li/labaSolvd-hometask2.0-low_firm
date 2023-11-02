package com.labasolvd;

public class Suspected extends Persona{

    private boolean wasConvicted;


    public Suspected(char gender, String name, String surname, int age, boolean wasConvicted) {
        super(gender, name, surname, age);
        this.wasConvicted = wasConvicted;
    }


    public boolean isWasConvicted() {
        return wasConvicted;
    }

    public void setWasConvicted(boolean wasConvicted) {
        this.wasConvicted = wasConvicted;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" + wasConvicted;
    }
}
