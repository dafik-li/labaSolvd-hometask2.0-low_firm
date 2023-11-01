package com.labasolvd;

public class Employees {

    private String name;
    private String surname;
    private int age;
    private char sex;
    private int experience;

    Employees( String name,
               String surname,
               int age,
               char sex,
               int experience) {
        this.setName(name);
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.experience = experience;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    public String toString() {
        return name + "\n" + surname + "\n" + age + "\n" + sex + "\n" + experience;
    }
}