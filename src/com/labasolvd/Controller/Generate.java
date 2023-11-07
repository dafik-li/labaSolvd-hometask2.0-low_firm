package com.labasolvd.Controller;

import com.labasolvd.Crimes.*;
import com.labasolvd.Persons.ProsecutorPersona;
import com.labasolvd.Persons.SolicitorPersona;
import com.labasolvd.Persons.SuspectedPersona;
import com.labasolvd.Result.CourtSession;
import com.labasolvd.Result.Result;

import java.util.Scanner;

public class Generate {

    private static Object Result = null;
    private static double sum;
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


    public int getLevelSolicitor() throws Exception {

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


    public int getLevelProsecutor() throws Exception {

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


    public boolean getArrestedSuspected() throws Exception {

        System.out.print("Is arrested before (1 - yes, 0 - no)? : ");
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

    public void getResult() throws Exception {

        SolicitorPersona solicitor = new SolicitorPersona('m', "dima", "pupkin", 30, getLevelSolicitor());
        ProsecutorPersona prosecutor = new ProsecutorPersona('m', "petya", "ivanov", 40, getLevelProsecutor());
        SuspectedPersona suspected = new SuspectedPersona('f', "ira", "petrova", 25,getArrestedSuspected());
        HooliganismCrime hooliganism = new HooliganismCrime();
        RobberyCrime robbery = new RobberyCrime();
        HomicideCrime homicide = new HomicideCrime();

        CourtSession calcResult = new CourtSession((com.labasolvd.Result.Result) Result, sum);
        double resultYears = calcResult.exeCalcResult(suspected, crime, solicitor, prosecutor);
        Result result = new Result(resultYears, suspected);
        CourtSession calcTotalSum = new CourtSession(result, sum);
        double sum = calcTotalSum.exeCalcSum(solicitor, crime);
        CourtSession totalSum = new CourtSession(result, sum);

        System.out.println("_________________________________________________________");
        System.out.println(result + "\n" + "_________________________________________________________");
        System.out.println("The payment is: " + totalSum);
    }
}
