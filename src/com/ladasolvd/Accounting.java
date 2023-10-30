package com.ladasolvd;

public class Accounting extends Department {

    private String category;

    Accounting(String name,
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
