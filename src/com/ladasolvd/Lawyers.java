package com.ladasolvd;

public class Lawyers extends Department {

    private String category;

    Lawyers( String name,
             String surname,
             int age,
             char sex,
             String category,
             int experience,
             String department) {
        super(name, surname, age, sex, experience, department);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
