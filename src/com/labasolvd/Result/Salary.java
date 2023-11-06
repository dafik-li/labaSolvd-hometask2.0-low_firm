package com.labasolvd.Result;

import com.labasolvd.Controller.Resulting;
import com.labasolvd.Persons.SolicitorPersona;

import java.util.Scanner;

public class Salary implements GettingSolicitorLevel, Resulting {
    private int levelSolicitor;
    private int salary;
    Scanner scanner = new Scanner(System.in);

    @Override
    public int getSolicitorLevel() throws Exception {
        System.out.print("Type a solicitor level (from 1 - to 3): ");
        levelSolicitor = scanner.nextInt();
        if (levelSolicitor == 1) {
            salary = 650;
        } else if (levelSolicitor == 2) {
            salary = 900;
        } else if (levelSolicitor == 3) {
            salary = 1200;
        } else {
            throw new Exception("Be attention!");
        }
        return levelSolicitor;
    }
    @Override
    public void getResult() throws Exception {
        SolicitorPersona solicitorPersona = new SolicitorPersona('m', "dima", "pupkin", 30, getSolicitorLevel());
        System.out.println("_________________________________________________________");
        System.out.println(solicitorPersona + "\n" + "Earns " + salary);
        System.out.println("_________________________________________________________");
    }
}
