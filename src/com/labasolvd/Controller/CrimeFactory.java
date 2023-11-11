package com.labasolvd.Controller;

import com.labasolvd.Entity.Crimes.*;

public class CrimeFactory {

    public AbstractCrime create (String crimeName) {
        if (crimeName.equals("homicide")) {
            return new HomicideCrime();
        }
        if (crimeName.equals("robbery")) {
            return new RobberyCrime();
        }
        if (crimeName.equals("hooliganism")) {
            return new HooliganismCrime();
        }
        return new DefaultCrime();
    }
}
