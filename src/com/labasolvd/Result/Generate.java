package com.labasolvd.Result;

import com.labasolvd.Entity.Crimes.*;
import com.labasolvd.Exceptions.CrimetypeException;
import com.labasolvd.Entity.Persons.*;
import com.labasolvd.Exceptions.ProsecutorLevelException;
import com.labasolvd.Exceptions.SolicitorLevelException;
import com.labasolvd.Exceptions.WasArrestedBeforeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.naming.PartialResultException;
import java.io.*;
import java.util.Scanner;

public class Generate implements LevelProsecutorInterface, LevelSolicitorInterface {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private final static Logger LOGGER = (Logger) LogManager.getLogger(Generate.class);
    private final static Object Result = null;
    private final static double sum = 0;
    private final static Scanner scanner = new Scanner(System.in);
    private static AbstractCrime crime;

    public String getCrime() {
        LOGGER.info("\n" + "Type the data below: ");
        LOGGER.info("\n" + "Type of the crime (homicide, robbery, hooliganism): ");
        String crimeName = scanner.nextLine();
        switch (crimeName) {
            case "homicide" -> crime = new HomicideCrime();
            case "robbery" -> crime = new RobberyCrime();
            case "hooliganism" -> crime = new HooliganismCrime();
            default -> crime = new DefaultCrime();
        }
        try {
            if (!crimeName.equals(crime.getTypeOfCrime())) {
                throw new CrimetypeException();
            }
        } catch (CrimetypeException e) {
            e.printStackTrace();
            LOGGER.error("Typed a non exist crimetype: - " + crimeName);
        } finally {
            LOGGER.info(crimeName);
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
        SuspectedPersona suspectedPersona = new SuspectedPersona('f', "ira", "petrova", 25, isWasArrestedBefore());
        /*
        HooliganismCrime hooliganism = new HooliganismCrime();
        RobberyCrime robbery = new RobberyCrime();
        HomicideCrime homicide = new HomicideCrime();
         */
        Judge calcResult = new Judge((com.labasolvd.Result.Result) Result, sum);
        double resultYears = calcResult.exeCalc(suspectedPersona, crime, solicitorPersona, prosecutorPersona);
        Result result = new Result(resultYears, suspectedPersona, solicitorPersona, prosecutorPersona);
        double sum = calcResult.exeCalc(solicitorPersona, crime);
        LOGGER.info("\n" + result + "\n");
        LOGGER.info("\n" + "The payment is: " + sum);
        try (PrintWriter writer = new PrintWriter(new File("judgement.txt"))) {
            writer.println(result);
            writer.println("The payment is: " + sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            LOGGER.error("File not exist or unwritable");
        }
        try (Scanner scanner = new Scanner(new File("judgement.txt"))) {
            while (scanner.hasNext()) {
                LOGGER.info(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
