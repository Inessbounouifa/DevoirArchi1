package org.sid.devoirarchi1.presentation;

import org.sid.devoirarchi1.dao.ICalcul;
import org.sid.devoirarchi1.metier.Gestion;

public class InstanciationDynamique {
    public static void main(String[] args) throws Exception {
        String className = "dao.CalculV1";
        Class<?> clazz = Class.forName(className);
        ICalcul cal = (ICalcul) clazz.getDeclaredConstructor().newInstance();

        Gestion gestion = new Gestion();
        gestion.setCal(cal);
        System.out.println("Dynamique = " + gestion.calcul());
    }
}