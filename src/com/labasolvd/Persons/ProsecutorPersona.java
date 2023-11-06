package com.labasolvd.Persons;

import com.labasolvd.Result.GettingProsecutorLevel;

public class ProsecutorPersona extends AbstractPersona implements GettingProsecutorLevel {
    private int prosecutorLevel;

    public ProsecutorPersona(char gender, String name, String surname, int age, int prosecutorLevel) {
        super(gender, name, surname, age);
        this.prosecutorLevel = prosecutorLevel;
    }
    @Override
    public int getProsecutorLevel() {
        return prosecutorLevel;
    }
    public void setProsecutorLevel(int prosecutorLevel) {
        this.prosecutorLevel = prosecutorLevel;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Level: " + getProsecutorLevel();
    }
}
