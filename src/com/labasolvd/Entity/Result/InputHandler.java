package com.labasolvd.Entity.Result;

import com.labasolvd.Entity.Persons.ProsecutorPersona;
import com.labasolvd.Entity.Persons.SolicitorPersona;
import com.labasolvd.Entity.Persons.SuspectedPersona;

public class InputHandler {
    SolicitorPersona solicitorPersona;
    ProsecutorPersona prosecutorPersona;
    SuspectedPersona suspectedPersona;

    public InputHandler(SolicitorPersona solicitorPersona, ProsecutorPersona prosecutorPersona, SuspectedPersona suspectedPersona) {
        this.solicitorPersona = solicitorPersona;
        this.prosecutorPersona = prosecutorPersona;
        this.suspectedPersona = suspectedPersona;
    }
    public SolicitorPersona getSolicitorPersona(int solicitorLevel) {
        return solicitorPersona;
    }
    public void setSolicitorPersona(SolicitorPersona solicitorPersona) {
        this.solicitorPersona = solicitorPersona;
    }
    public ProsecutorPersona getProsecutorPersona(int prosecutorLevel) {
        return prosecutorPersona;
    }
    public void setProsecutorPersona(ProsecutorPersona prosecutorPersona) {
        this.prosecutorPersona = prosecutorPersona;
    }
    public SuspectedPersona getSuspectedPersona() {
        return suspectedPersona;
    }
    public void setSuspectedPersona(SuspectedPersona suspectedPersona) {
        this.suspectedPersona = suspectedPersona;
    }
}
