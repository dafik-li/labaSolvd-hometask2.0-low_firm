package com.labasolvd.Entity.Persons;

public class SolicitorPersona extends AbstractPersona implements LevelSolicitorInterface{
    private int level;

    public SolicitorPersona(char gender, String name, String surname, int age, int level) {
        super(gender, name, surname, age);
        this.level = level;
    }
    @Override
    public int getSolicitorLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Level: " + getSolicitorLevel();
    }
}
