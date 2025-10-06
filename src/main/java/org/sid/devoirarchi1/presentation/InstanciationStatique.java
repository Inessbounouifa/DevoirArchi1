package org.sid.devoirarchi1.presentation;

import org.sid.devoirarchi1.dao.CalculV1;
import org.sid.devoirarchi1.metier.Gestion;

public class InstanciationStatique {
    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        CalculV1 cal = new CalculV1();
        gestion.setCal(cal);
        System.out.println("Statique = " + gestion.calcul());
    }
}