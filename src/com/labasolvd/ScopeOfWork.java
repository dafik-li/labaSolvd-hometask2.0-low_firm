package com.labasolvd;

public class ScopeOfWork {

    private int consultation;
    private int registration;
    private int legalProceeding;

    ScopeOfWork(int consultation, int registration, int legalProceeding) {
        this.consultation = consultation;
        this.registration = registration;
        this.legalProceeding = legalProceeding;
    }

    public int getConsultation() {
        return consultation;
    }

    public void setConsultation(int consultation) {
        this.consultation = consultation;
    }

    public int getLegalProceeding() {
        return legalProceeding;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getRegistration() {
        return registration;
    }

    public void setLegalProceeding(int legalProceeding) {
        this.legalProceeding = legalProceeding;
    }
}
