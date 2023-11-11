package com.labasolvd.Controller;

import com.labasolvd.Entity.Crimes.*;
import com.labasolvd.Exceptions.CrimetypeException;
import com.labasolvd.Exceptions.ProsecutorLevelException;
import com.labasolvd.Exceptions.SolicitorLevelException;
import com.labasolvd.Exceptions.WasArrestedBeforeException;

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
            throw new CrimetypeException("Enter a valid crime name. You typed - " + crimeName);
        }
    }
    public void validateSolicitorLevel(int levelSolicitor) throws SolicitorLevelException {
        if (levelSolicitor > 3) {
            throw new SolicitorLevelException("Entered level is great than 3. You typed - " + levelSolicitor);
        }
        if (levelSolicitor < 1) {
            throw new SolicitorLevelException("Entered level is less than 1. You typed - " + levelSolicitor);
        }
    }
    public void validateProsecutorLevel(int levelProsecutor) throws ProsecutorLevelException {
        if (levelProsecutor > 3) {
            throw new ProsecutorLevelException("Entered level is great than 3. You typed - " + levelProsecutor);
        }
        if (levelProsecutor < 1) {
            throw new ProsecutorLevelException("Entered level is less than 1. You typed - " + levelProsecutor);
        }
    }
    public void validateArrestedBefore(int numberForArrested) throws WasArrestedBeforeException {
        if (numberForArrested == 1) {
        }
        if (numberForArrested == 0) {
        } else {
            throw new WasArrestedBeforeException("Please type 1 or 0");
        }
    }
}

