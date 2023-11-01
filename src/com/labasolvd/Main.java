package com.labasolvd;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {
        


        Accounting accounting = new Accounting("vitali", "burym", 35, 'm', "high", 15, "lawyer");
        Clients clients = new Clients("vitali", "burym", 35, 'm');
        Department department = new Department("vitali", "burym", 35, 'm', 15, "lawyer");
        Employees employees = new Employees("vitali", "burym", 35, 'm', 35);
        /*Consultation consultation = new Consultation();
        Expenses expenses = new Expenses();
        Income income = new Income();
        Lawyers lawyers = new Lawyers();
        LegalProceeding legalProceeding = new LegalProceeding();
        Profit profit = new Profit();
        Registration registration = new Registration();
        Rent rent = new Rent();
        Salary salary = new Salary();
        ScopeOfWork scopeOfWork = new ScopeOfWork();

         */

        accounting.clone();
        System.out.println(accounting.getClass());
        System.out.println(accounting.toString().toUpperCase());
        employees.setName("dfd");
        System.out.println(employees.getName());
        employees.setSurname("rewr");



        System.out.println(accounting.getSurname());
        System.out.println(department.getSurname());


    }
}
