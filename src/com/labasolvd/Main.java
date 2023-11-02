package com.labasolvd;


public class Main {

    private Result result;


    public static void main(String[] args) throws CloneNotSupportedException {


        Prosecutor prosecutor = new Prosecutor('m', "petya", "ivanov", 40, 5);
        Suspected suspected = new Suspected('f', "ira", "petrova", 25, true);
        Solicitor solicitor = new Solicitor('m', "dima", "pupkin", 30, 8);
        Hooliganism hooliganism = new Hooliganism("Hooliganism", 5);
        Robbery robbery = new Robbery("Robbery", 10);
        Homicide homicide = new Homicide("Homicide", 20);
        Result result = new Result(5.0);

        System.out.println(result.calcResult());

    }
}
