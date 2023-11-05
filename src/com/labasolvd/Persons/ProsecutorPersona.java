package com.labasolvd.Persons;

public class ProsecutorPersona extends AbstractPersona {

    private int level;


    public ProsecutorPersona(char gender, String name, String surname, int age, int level) {
        super(gender, name, surname, age);
        this.level = level;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" + " Level: " + getLevel();
    }
}
