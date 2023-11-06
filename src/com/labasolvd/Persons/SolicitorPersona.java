package com.labasolvd.Persons;

import com.labasolvd.Result.GettingSolicitorLevel;

public class SolicitorPersona extends AbstractPersona implements GettingSolicitorLevel {
    private int solicitorLevel;

    public SolicitorPersona(char gender, String name, String surname, int age, int solicitorLevel) {
        super(gender, name, surname, age);
        this.solicitorLevel = solicitorLevel;
    }
    @Override
    public int getSolicitorLevel() {
        return solicitorLevel;
    }
    public void setSolicitorLevel(int solicitorLevel) {
        this.solicitorLevel = solicitorLevel;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Level: " + getSolicitorLevel();
    }
}
