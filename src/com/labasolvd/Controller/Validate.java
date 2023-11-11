package com.labasolvd.Controller;

import com.labasolvd.Entity.Crimes.*;
import com.labasolvd.Exceptions.CrimetypeException;
import com.labasolvd.Exceptions.SolicitorLevelException;

public class Validate {
    AbstractCrime abstractCrime;

    public void validateCrimeName(String crimeName) throws CrimetypeException {
        switch (crimeName) {
            case "homicide" -> abstractCrime = new HomicideCrime();
            case "robbery" -> abstractCrime = new RobberyCrime();
            case "hooliganism" -> abstractCrime = new HooliganismCrime();
            default -> abstractCrime = new DefaultCrime();
        }
        if (!crimeName.equals(abstractCrime.getTypeOfCrime())) {
            throw new CrimetypeException("Enter a valid crime name");
        }
    }
    public void validateSolicitorLevel(int levelSolicitor) throws SolicitorLevelException {
        if (levelSolicitor > 3) {
            throw new SolicitorLevelException("Level is great than 3");
        }
        if (levelSolicitor < 1) {
            throw new SolicitorLevelException("Level is less than 1");
        }
    }
    public void validateProsecutorLevel(int levelProsecutor) throws SolicitorLevelException {
        if (levelProsecutor > 3) {
            throw new SolicitorLevelException("Level is great than 3");
        }
        if (levelProsecutor < 1) {
            throw new SolicitorLevelException("Level is less than 1");
        }
    }

}

