package com.labasolvd.Persons;

public class SuspectedPersona extends AbstractPersona {


    private boolean wasArrestedBefore;



    public SuspectedPersona(char gender, String name, String surname, int age, boolean wasArrestedBefore) {
        super(gender, name, surname, age);
        this.wasArrestedBefore = wasArrestedBefore;
    }

    public boolean isWasArrestedBefore() {
        return wasArrestedBefore;
    }

    public void setWasArrestedBefore(boolean wasArrestedBefore) {
        this.wasArrestedBefore = wasArrestedBefore;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + wasArrestedBefore;
    }
}