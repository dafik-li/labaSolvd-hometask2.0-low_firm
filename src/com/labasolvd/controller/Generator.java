package com.labasolvd.controller;

import com.labasolvd.collections.CrimeHashMap;
import com.labasolvd.collections.ProsecutorLinkedList;
import com.labasolvd.collections.SolicitorArrayList;
import com.labasolvd.collections.SuspectedHashSet;
import com.labasolvd.entity.result.Result;
import com.labasolvd.entity.crimes.*;
import com.labasolvd.entity.persons.*;
import com.labasolvd.exceptions.CrimetypeException;
import com.labasolvd.exceptions.ProsecutorLevelException;
import com.labasolvd.exceptions.SolicitorLevelException;
import com.labasolvd.exceptions.WasArrestedBeforeException;
import com.labasolvd.interfaces.LevelProsecutorInterface;
import com.labasolvd.interfaces.LevelSolicitorInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import java.io.*;
import java.util.Scanner;

public class Generator implements LevelProsecutorInterface, LevelSolicitorInterface {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private final static Logger LOGGER = (Logger) LogManager.getLogger(Generator.class);
    private Result result;
    private final static double sum = 0;
    private final Scanner scanner;
    private final Validator validator;
    private final SolicitorArrayList solicitorArrayList;
    private final ProsecutorLinkedList<ProsecutorPerson> prosecutorLinkedList;
    private final SuspectedHashSet suspectedHashSet;
    private final CrimeHashMap crimeHashMap;

    public Generator() {
        this.validator = new Validator();
        this.scanner = new Scanner(System.in);
        this.solicitorArrayList = new SolicitorArrayList();
        this.prosecutorLinkedList = new ProsecutorLinkedList();
        this.suspectedHashSet = new SuspectedHashSet();
        this.crimeHashMap = new CrimeHashMap();
    }

    public AbstractCrime getCrime() throws Exception {
        LOGGER.info("\n" + "Type the crime (homicide, robbery, hooliganism): ");
        String crimeName = scanner.nextLine();
        try {
            validator.validateCrimeName(crimeName);
        } catch (CrimetypeException e) {
            LOGGER.error(e.toString());
            return getCrime();
        }
        LOGGER.info("The type of crime is - " + crimeName);
        return crimeHashMap.findCrime(crimeHashMap.createCrimeHashMap(), crimeName);
    }
    @Override
    public int getSolicitorLevel() {
        LOGGER.info("\n" + "Enter the solicitor level (from 1 - to 3): ");
        int levelSolicitor;
        String level = scanner.nextLine();
        try {
            levelSolicitor = Integer.parseInt(level);
            try {
                validator.validateSolicitorLevel(levelSolicitor);
                LOGGER.info("Solicitor level is - " + levelSolicitor);
            } catch (SolicitorLevelException e) {
                LOGGER.error(e.toString());
                levelSolicitor = getSolicitorLevel();
            }
        } catch (NumberFormatException e) {
            LOGGER.error(e.toString());
            levelSolicitor = getSolicitorLevel();
        }
        return levelSolicitor;
    }
    @Override
    public int getProsecutorLevel() {
        LOGGER.info("\n" + "Enter the prosecutor level (from 1 - to 3): ");
        int levelProsecutor;
        String level = scanner.nextLine();
        try {
            levelProsecutor = Integer.parseInt(level);
            try {
                validator.validateProsecutorLevel(levelProsecutor);
                LOGGER.info("Prosecutor level is - " + levelProsecutor);
            } catch (ProsecutorLevelException e) {
                LOGGER.error(e.toString());
                levelProsecutor = getProsecutorLevel();
            }
        } catch (NumberFormatException e) {
            LOGGER.error(e.toString());
            levelProsecutor = getProsecutorLevel();
        }
        return levelProsecutor;
    }
    public boolean isWasArrestedBefore() {
        LOGGER.info("\n" + "Is arrested before (1 - yes, 0 - no)?: ");
        int numberForArrested = scanner.nextInt();
        try {
            validator.validateArrestedBefore(numberForArrested);
            LOGGER.info("You typed - " + numberForArrested);
        } catch (WasArrestedBeforeException e) {
            LOGGER.error(e.toString());
        }
        if (numberForArrested == 1) {
            return true;
        }
        return false;
    }
    public void getResult() throws Exception {
        AbstractCrime crime = getCrime();
        SolicitorPerson solicitor = solicitorArrayList.findSolicitor(getSolicitorLevel());
        ProsecutorPerson prosecutor = prosecutorLinkedList.findSProsecutor(getProsecutorLevel());
        SuspectedPerson suspected = suspectedHashSet.findSuspected(isWasArrestedBefore());
        Judge calcResult = new Judge(result, sum);
        double resultYears = calcResult.exeCalc(suspected, crime, solicitor, prosecutor);
        Result result = new Result(resultYears, suspected, solicitor, prosecutor);
        double sum = calcResult.exeCalc(solicitor, crime);
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
