package com.labasolvd;

public class Department extends Employees {

    private String department;

    Department(String name,
               String surname,
               int age,
               char sex,
               int experience,
               String department) {
        super(name, surname, age, sex, experience);
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return super.toString() + "\n" + department;
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }
}