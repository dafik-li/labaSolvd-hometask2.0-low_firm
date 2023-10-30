package com.ladasolvd;

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
}
