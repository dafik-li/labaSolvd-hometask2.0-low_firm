package com.labasolvd.Result;

import com.labasolvd.Persons.LevelProsecutorInterface;
import com.labasolvd.Persons.ProsecutorPersona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Scanner;

public final class GiveBribe implements LevelProsecutorInterface {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private final static Logger LOGGER = (Logger) LogManager.getLogger(GiveBribe.class);
    private static int bribe;
    Scanner scanner = new Scanner(System.in);

    @Override
    public int getProsecutorLevel() throws Exception {
        LOGGER.info("\n" + "Type a prosecutor level (from 1 - to 3): ");
        int levelProsecutor = scanner.nextInt();
        if (levelProsecutor == 1) {
            bribe = 100;
        } else if (levelProsecutor == 2) {
            bribe = 200;
        } else if (levelProsecutor == 3) {
            bribe = 500;
        } else {
            throw new Exception("Keep your eyes open");
        }
        return levelProsecutor;
    }
    public void getBribe() throws Exception {
        ProsecutorPersona prosecutorPersona = new ProsecutorPersona('m', "petya", "ivanov", 40, getProsecutorLevel());
        LOGGER.info("\n" + prosecutorPersona + "\n" + "Require a bribe: " + bribe);
    }
}
