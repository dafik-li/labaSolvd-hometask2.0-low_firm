package com.labasolvd.Result;

import com.labasolvd.Controller.Resulting;
import com.labasolvd.Persons.ArrestedBefore;
import com.labasolvd.Persons.CheckingGender;
import com.labasolvd.Persons.JobCandidate;
import com.labasolvd.Persons.SolicitorPersona;

import java.util.Scanner;

public class Hire implements ArrestedBefore, CheckingGender, Resulting {
    Scanner scanner = new Scanner(System.in);

    @Override
    public boolean isWasArrestedBefore() throws Exception {
        System.out.println("_________________________________________________________" + "\n" + "Check the job candidate" + "\n");
        System.out.print("Is arrested before (1 - yes, 0 - no)?: ");
        int numberForArrested = scanner.nextInt();
        boolean wasArrestedBefore;
        if (numberForArrested == 1) {
            wasArrestedBefore = true;
            System.out.println("Get rid of him!");
        } else if (numberForArrested == 0) {
            wasArrestedBefore = false;
            System.out.println("Hire him!");
        } else {
            throw new Exception("Keep your eyes open");
        }
        return wasArrestedBefore;
    }
    @Override
    public boolean isGenderFemale() throws Exception {
        System.out.println("_________________________________________________________" + "\n" + "Checking gender" + "\n");
        System.out.print("Is a candidate female (1 - yes, 0 - no)?: ");
        int candidateGender = scanner.nextInt();
        boolean genderFemale;
        if (candidateGender == 1) {
            genderFemale = true;
            System.out.println("Candidate is a female");
            System.out.print("Type a tits size: ");
            int sizeOfTits = scanner.nextInt();
            System.out.println("_________________________________________________________" + "\n" + "Attention! Private information" + "\n");
            SolicitorPersona jobCandidate1 = new SolicitorPersona('f', "katya", "stepanova", 35, 1);
            System.out.println("Candidate " + "\n" + jobCandidate1 + "\n" + "Tits size: " + sizeOfTits);
        } else if (candidateGender == 0) {
            genderFemale = false;
            System.out.println("Candidate is a male" + "\n" + "Candidate's info");
            SolicitorPersona jobCandidate2 = new SolicitorPersona('m', "inav", "ivanow", 40, 1);
            System.out.println(jobCandidate2);
        } else {
            throw new Exception("This is it!");
        }
        return genderFemale;
    }
    @Override
    public void getResult() throws Exception {
        JobCandidate jobCandidate = new JobCandidate('f', "lisa", "ivanova", 30, isWasArrestedBefore(), isGenderFemale());
        System.out.println("_________________________________________________________");
    }
}

