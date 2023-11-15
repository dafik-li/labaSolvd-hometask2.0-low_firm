package com.labasolvd.controller;

import com.labasolvd.entity.crimes.*;
import com.labasolvd.exceptions.CrimetypeException;
import com.labasolvd.exceptions.ProsecutorLevelException;
import com.labasolvd.exceptions.SolicitorLevelException;
import com.labasolvd.exceptions.WasArrestedBeforeException;

public class Validator {
    AbstractCrime abstractCrime;

    public void validateCrimeName(String crimeName) throws CrimetypeException {
        switch (crimeName) {
            case "homicide" -> abstractCrime = new HomicideCrime();
            case "robbery" -> abstractCrime = new RobberyCrime();
            case "hooliganism" -> abstractCrime = new HooliganismCrime();
            default -> abstractCrime = new DefaultCrime();
        }
        if (!crimeName.equals(abstractCrime.getTypeOfCrime())) {
            throw new CrimetypeException("Entered an invalid crime name. You typed - " + crimeName);
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
        }
        else {
            throw new WasArrestedBeforeException("Please type 1 or 0");
        }
    }
}

