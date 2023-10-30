package com.ladasolvd;

public class Clients {

    private String name;
    private String surname;
    private int age;
    private char sex;

    Clients(String name, String surname, int age, char sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
