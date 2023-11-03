package com.labasolvd;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the data below: ");
        System.out.println("Choose one type of the crime: ");
        System.out.println("hooliganism");
        System.out.println("robbery");
        System.out.println("homicide");
        String crimeName = scanner.nextLine();
        System.out.println("Enter the solicitor level (from 1 - to 3): ");
        int levelSolicitor = scanner.nextInt();
        System.out.println("Enter the prosecutor level (from 1 - to 3): ");
        int levelProsecutor = scanner.nextInt();
        System.out.println("Is arrested before?:  '1' - yes, '0' - no");
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
        double resultYears = calcResult.execute(wasArrestedBefore, levelSolicitor, levelProsecutor, crime.getTermOfPunishment());
        Result result = new Result(resultYears, suspected);
        CalcTotalSum calcTotalSum = new CalcTotalSum();
        double sum = calcTotalSum.execute(levelSolicitor, crime.getTermOfPunishment());
        TotalSum totalSum = new TotalSum(sum);


        System.out.println("Court decision: " + result + "years");
        System.out.println("Congratulation! You must pay: " + totalSum);
    }
}
