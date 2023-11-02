package com.labasolvd;

public class Solicitor extends Persona {

    private int level;


    public Solicitor(char gender, String name, String surname, int age, int level) {
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
        return super.toString() + "\n" + level;
    }
}
