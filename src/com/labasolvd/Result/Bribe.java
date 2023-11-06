package com.labasolvd.Result;

import com.labasolvd.Controller.Resulting;
import com.labasolvd.Persons.ProsecutorPersona;
import java.util.Scanner;

public class Bribe implements GettingProsecutorLevel, Resulting {
    private int bribe;
    private int levelProsecutor;
    Scanner scanner = new Scanner(System.in);

    @Override
    public int getProsecutorLevel() throws Exception {
        System.out.print("Type a prosecutor level (from 1 - to 3): ");
        levelProsecutor = scanner.nextInt();
        if (levelProsecutor == 1) {
            bribe = 100;
        } else if (levelProsecutor == 2) {
            bribe = 200;
        } else if (levelProsecutor == 3) {
            bribe = 500;
        } else {
            throw new Exception("Be attention!");
        }
        return levelProsecutor;
    }
    @Override
    public void getResult() throws Exception {
        ProsecutorPersona prosecutorPersona = new ProsecutorPersona('m', "petya", "ivanov", 40, getProsecutorLevel());
        System.out.println("_________________________________________________________");
        System.out.println(prosecutorPersona + "\n" + "Require a bribe: " + bribe);
        System.out.println("_________________________________________________________");
    }
}
