package com.labasolvd;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        System.out.println("_________________________________________________________" + "\n" + "Type the data below: " + "\n");
        System.out.print("Type of the crime (homicide, robbery, hooliganism): ");
        String crimeName = scanner.nextLine();


        AbstractCrime crime;
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


        System.out.print("Enter the solicitor level (from 1 - to 3): ");


        int levelSolicitor = scanner.nextInt();
        if (levelSolicitor > 3) {
            throw new Exception("Too big solicitor level!");
        } else if (levelSolicitor < 1) {
            throw new Exception("Too small solicitor level!");
        } else {
            System.out.println();
        }


        System.out.print("Enter the prosecutor level (from 1 - to 3): ");


        int levelProsecutor = scanner.nextInt();
        if (levelProsecutor > 3) {
            throw new Exception("Too big solicitor level!");
        } else if (levelProsecutor < 1) {
            throw new Exception("Too small solicitor level!");
        } else {
            System.out.println();
        }


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


        SolicitorPersona solicitor = new SolicitorPersona('m', "dima", "pupkin", 30, levelSolicitor);
        ProsecutorPersona prosecutor = new ProsecutorPersona('m', "petya", "ivanov", 40, levelProsecutor);
        SuspectedPersona suspected = new SuspectedPersona('f', "ira", "petrova", 25, wasArrestedBefore);
        HooliganismCrime hooliganism = new HooliganismCrime();
        RobberyCrime robbery = new RobberyCrime();
        HomicideCrime homicide = new HomicideCrime();


        CalcResult calcResult = new CalcResult();
        double resultYears = calcResult.execute(wasArrestedBefore, levelSolicitor, levelProsecutor, crime.getTermOfPunishment());
        Result result = new Result(resultYears, suspected);
        CalcTotalSum calcTotalSum = new CalcTotalSum();
        double sum = calcTotalSum.execute(levelSolicitor, crime.getTermOfPunishment());
        TotalSum totalSum = new TotalSum(sum);


        System.out.println("_________________________________________________________");
        System.out.println(result + "\n" + "_________________________________________________________");
        System.out.println("The payment is: " + totalSum);
    }
}