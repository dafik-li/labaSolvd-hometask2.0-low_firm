package com.labasolvd.Persons;

abstract public class AbstractPersona {
    protected char gender;
    protected String name;
    protected String surname;
    protected int age;

    public AbstractPersona(char gender, String name, String surname, int age) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Gender: " + getGender() + "\n" + "Name: " + getName() + "\n" + "Surname: " + getSurname() + "\n" + "Age: " + getAge();
    }
}
