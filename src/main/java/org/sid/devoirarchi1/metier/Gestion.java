package org.sid.devoirarchi1.metier;

import org.sid.devoirarchi1.dao.ICalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gestion")
public class Gestion implements IGestion {
    private ICalcul cal;

    public Gestion() {}

    @Autowired
    public Gestion(@Qualifier("calculV2") ICalcul cal) {
        this.cal = cal;
    }

    public void setCal(ICalcul c) {
        this.cal = c;
    }

    @Override
    public double calcul() {
        double d = cal.getValue();
        double resultat = d * 10;
        return resultat;
    }
}