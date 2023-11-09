package com.labasolvd.Result;

import com.labasolvd.Persons.LevelSolicitorInterface;
import com.labasolvd.Persons.SolicitorPersona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import java.util.Scanner;

public final class PaySalary implements LevelSolicitorInterface {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private final static Logger LOGGER = (Logger) LogManager.getLogger(PaySalary.class);
    private static int salary;
    Scanner scanner = new Scanner(System.in);

    @Override
    public int getSolicitorLevel() throws Exception {
        LOGGER.info("\n" + "Type a solicitor level (from 1 - to 3): ");
        int levelSolicitor = scanner.nextInt();
        if (levelSolicitor == 1) {
            salary = 650;
        } else if (levelSolicitor == 2) {
            salary = 900;
        } else if (levelSolicitor == 3) {
            salary = 1200;
        } else {
            throw new Exception("Keep your eyes open");
        }
        return levelSolicitor;
    }
    public void getSalary() throws Exception {
        SolicitorPersona solicitorPersona = new SolicitorPersona('m', "dima", "pupkin", 30, getSolicitorLevel());
        LOGGER.info("\n" + solicitorPersona + "\n" + "Earns: " + salary);
    }
}
