package com.labasolvd.Controller;

import com.labasolvd.Entity.Result.Result;
import com.labasolvd.Entity.Crimes.*;
import com.labasolvd.Entity.Persons.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import java.io.*;
import java.util.Scanner;

public class Generate implements LevelProsecutorInterface, LevelSolicitorInterface {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private final static Logger LOGGER = (Logger) LogManager.getLogger(Generate.class);
    private final static Object Result = null;
    private final static double sum = 0;
    private final Scanner scanner = new Scanner(System.in);
    private final Validate validate;
    private final CrimeFactory crimeFactory;

    public Generate() {
        this.validate = new Validate();
        this.crimeFactory = new CrimeFactory();
    }
    public AbstractCrime getCrime() {
        LOGGER.info("\n" + "Type of the crime (homicide, robbery, hooliganism): ");
        String crimeName = scanner.nextLine();
        try {
            LOGGER.info(crimeName);
            validate.validateCrimeName(crimeName);
        } catch (Exception e) {
            LOGGER.error(e.toString());
            return getCrime();
        }
        return crimeFactory.create(crimeName);
    }
    @Override
    public int getSolicitorLevel() {
        LOGGER.info("\n" + "Enter the solicitor level (from 1 - to 3): ");
        int levelSolicitor = scanner.nextInt();
        try {
            LOGGER.info(levelSolicitor);
            validate.validateSolicitorLevel(levelSolicitor);
        } catch (Exception e) {
            LOGGER.error(e.toString());
            levelSolicitor = getSolicitorLevel();
        }
        return levelSolicitor;
    }
    @Override
    public int getProsecutorLevel() {
        LOGGER.info("\n" + "Enter the prosecutor level (from 1 - to 3): ");
        int levelProsecutor = scanner.nextInt();
        try {
            LOGGER.info(levelProsecutor);
            validate.validateProsecutorLevel(levelProsecutor);
        } catch (Exception e) {
            LOGGER.error(e.toString());
            levelProsecutor = getProsecutorLevel();
        }
        return levelProsecutor;
    }
    public boolean isWasArrestedBefore() {
        LOGGER.info("\n" + "Is arrested before (1 - yes, 0 - no)?: ");
        int numberForArrested = scanner.nextInt();
        try {
            LOGGER.info(numberForArrested);
            validate.validateArrestedBefore(numberForArrested);
        } catch (Exception e) {
            LOGGER.error(e.toString());
        }
        if (numberForArrested == 1) {
            return true;
        }
        return false;
    }
    public void getResult() {
        AbstractCrime crime = getCrime();
        SolicitorPersona solicitorPersona = new SolicitorPersona('m', "dima", "pupkin", 30, getSolicitorLevel());
        ProsecutorPersona prosecutorPersona = new ProsecutorPersona('m', "petya", "ivanov", 40, getProsecutorLevel());
        SuspectedPersona suspectedPersona = new SuspectedPersona('f', "ira", "petrova", 25, isWasArrestedBefore());
        Judge calcResult = new Judge((com.labasolvd.Entity.Result.Result) Result, sum);
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
