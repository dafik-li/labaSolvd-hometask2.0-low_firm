package com.labasolvd.Result;

import com.labasolvd.Controller.Resulting;
import com.labasolvd.Crimes.*;
import com.labasolvd.Persons.ArrestedBefore;
import com.labasolvd.Persons.ProsecutorPersona;
import com.labasolvd.Persons.SolicitorPersona;
import com.labasolvd.Persons.SuspectedPersona;

import java.util.Scanner;

public class Generate implements ArrestedBefore, GettingSolicitorLevel, GettingProsecutorLevel, Resulting {
    private static final Object Result = null;
    private static final double sum = 0;
    Scanner scanner = new Scanner(System.in);
    AbstractCrime crime;
    public String getCrime() throws Exception {
        System.out.println("_________________________________________________________" + "\n" + "Type the data below: " + "\n");
        System.out.print("Type of the crime (homicide, robbery, hooliganism): ");
        String crimeName = scanner.nextLine();
        switch (crimeName) {
            case "homicide": crime = new HomicideCrime();
                break;
            case "robbery": crime = new RobberyCrime();
                break;
            case "hooliganism": crime = new HooliganismCrime();
                break;
            default: crime = new DefaultCrime();
        }
        if (!crimeName.equals(crime.getTypeOfCrime())) {
            throw new Exception("Sometimes laws don't matter!");
        } else {
            System.out.println();
        }
        return crimeName;
    }
    @Override
    public int getSolicitorLevel() throws Exception {
        System.out.print("Enter the solicitor level (from 1 - to 3): ");
        int levelSolicitor = scanner.nextInt();
        if (levelSolicitor > 3) {
            throw new Exception("Too big solicitor level!");
        } else if (levelSolicitor < 1) {
            throw new Exception("Too small solicitor level!");
        } else {
            System.out.println();
        }
        return levelSolicitor;
    }
    @Override
    public int getProsecutorLevel() throws Exception {
        System.out.print("Enter the prosecutor level (from 1 - to 3): ");
        int levelProsecutor = scanner.nextInt();
        if (levelProsecutor > 3) {
            throw new Exception("Too big solicitor level!");
        } else if (levelProsecutor < 1) {
            throw new Exception("Too small solicitor level!");
        } else {
            System.out.println();
        }
        return levelProsecutor;
    }
    @Override
    public boolean isWasArrestedBefore() throws Exception {
        System.out.print("Is arrested before (1 - yes, 0 - no)?: ");
        int numberForArrested = scanner.nextInt();
        boolean wasArrestedBefore;
        if (numberForArrested == 1) {
            wasArrestedBefore = true;
        } else if (numberForArrested == 0) {
            wasArrestedBefore = false;
        } else {
            throw new Exception("Keep your eyes open");
        }
        return wasArrestedBefore;
    }
    @Override
    public void getResult() throws Exception {
        SolicitorPersona solicitorPersona = new SolicitorPersona('m', "dima", "pupkin", 30, getSolicitorLevel());
        ProsecutorPersona prosecutorPersona = new ProsecutorPersona('m', "petya", "ivanov", 40, getProsecutorLevel());
        SuspectedPersona suspectedPersona = new SuspectedPersona('f', "ira", "petrova", 25,isWasArrestedBefore());
        /*
        HooliganismCrime hooliganism = new HooliganismCrime();
        RobberyCrime robbery = new RobberyCrime();
        HomicideCrime homicide = new HomicideCrime();
         */
        CourtSession calcResult = new CourtSession((com.labasolvd.Result.Result) Result, sum);
        double resultYears = calcResult.exeCalc(suspectedPersona, crime, solicitorPersona, prosecutorPersona);
        Result result = new Result(resultYears, suspectedPersona, solicitorPersona, prosecutorPersona);
        CourtSession calcTotalSum = new CourtSession(result, sum);
        double sum = calcTotalSum.exeCalc(solicitorPersona, crime);
        CourtSession totalSum = new CourtSession(result, sum);
        System.out.println("_________________________________________________________");
        System.out.println(result + "\n" + "_________________________________________________________");
        System.out.println("The payment is: " + totalSum);
    }
}
