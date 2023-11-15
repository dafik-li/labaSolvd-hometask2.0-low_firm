package com.labasolvd.controller;

import com.labasolvd.entity.persons.ProsecutorPerson;
import com.labasolvd.entity.persons.SolicitorPerson;
import com.labasolvd.entity.persons.SuspectedPerson;

public class Creator {

    public SuspectedPerson setSuspectedPerson (char gender, String name, String surname, int age, boolean wasArrestedBefore) {
        return new SuspectedPerson(gender, name, surname, age, wasArrestedBefore);
    }
    public SolicitorPerson setSolicitorPerson (char gender, String name, String surname, int age, int level) {
        return new SolicitorPerson(gender, name, surname, age, level);
    }
    public ProsecutorPerson setProsecutorPerson (char gender, String name, String surname, int age, int level) {
        return  new ProsecutorPerson(gender, name, surname, age, level);
    }
}
