package com.labasolvd.Persons;

public class JobCandidate extends AbstractPersona implements ArrestedBefore, CheckingGender {
    private boolean wasArrestedBefore;
    private boolean genderFemale;
    public JobCandidate(char gender, String name, String surname, int age, boolean wasArrestedBefore, boolean genderFemale) {
        super(gender, name, surname, age);
        this.wasArrestedBefore = wasArrestedBefore;
        this.genderFemale = genderFemale;
    }
    @Override
    public boolean isGenderFemale() {
        return genderFemale;
    }
    @Override
    public boolean isWasArrestedBefore() {
        return wasArrestedBefore;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Was arrested before: " + isWasArrestedBefore() + "\n" + "Candidate is a female: " + isGenderFemale();
    }
}
