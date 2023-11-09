package com.labasolvd.Result;

import com.labasolvd.Crimes.*;
import com.labasolvd.Persons.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import java.util.Scanner;

public final class Generate implements LevelProsecutorInterface, LevelSolicitorInterface {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private final static Logger LOGGER = (Logger) LogManager.getLogger(Generate.class);
    private final static Object Result = null;
    private final static double sum = 0;
    private final static Scanner scanner = new Scanner(System.in);
    private static AbstractCrime crime;

    public String getCrime() throws Exception {
        LOGGER.info("\n" + "Type the data below: ");
        LOGGER.info("\n" + "Type of the crime (homicide, robbery, hooliganism): ");
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
        LOGGER.info("\n" + "Enter the solicitor level (from 1 - to 3): ");
        int levelSolicitor = scanner.nextInt();
        if (levelSolicitor > 3) {
            throw new Exception("\n" + "Too big solicitor level!");
        } else if (levelSolicitor < 1) {
            throw new Exception("\n" + "Too small solicitor level!");
        }
        return levelSolicitor;
    }
    @Override
    public int getProsecutorLevel() throws Exception {
        LOGGER.info("\n" + "Enter the prosecutor level (from 1 - to 3): ");
        int levelProsecutor = scanner.nextInt();
        if (levelProsecutor > 3) {
            throw new Exception("\n" + "Too big solicitor level!");
        } else if (levelProsecutor < 1) {
            throw new Exception("\n" + "Too small solicitor level!");
        }
        return levelProsecutor;
    }

    public static boolean isWasArrestedBefore() throws Exception {
        LOGGER.info("\n" + "Is arrested before (1 - yes, 0 - no)?: ");
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
    public final void getResult() throws Exception {
        SolicitorPersona solicitorPersona = new SolicitorPersona('m', "dima", "pupkin", 30, getSolicitorLevel());
        ProsecutorPersona prosecutorPersona = new ProsecutorPersona('m', "petya", "ivanov", 40, getProsecutorLevel());
        SuspectedPersona suspectedPersona = new SuspectedPersona('f', "ira", "petrova", 25,isWasArrestedBefore());
        /*
        HooliganismCrime hooliganism = new HooliganismCrime();
        RobberyCrime robbery = new RobberyCrime();
        HomicideCrime homicide = new HomicideCrime();
         */
        Judge calcResult = new Judge((com.labasolvd.Result.Result) Result, sum);
        double resultYears = calcResult.exeCalc(suspectedPersona, crime, solicitorPersona, prosecutorPersona);
        Result result = new Result(resultYears, suspectedPersona, solicitorPersona, prosecutorPersona);
        double sum = calcResult.exeCalc(solicitorPersona, crime);
        Judge totalSum = new Judge(result, sum);
        LOGGER.info("\n" + result + "\n");
        LOGGER.info("\n" + "The payment is: " + totalSum);
    }
}
