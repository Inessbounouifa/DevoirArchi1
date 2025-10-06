package org.sid.devoirarchi1.presentation;

import org.sid.devoirarchi1.metier.IGestion;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationApp {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext("dao", "metier")) {
            IGestion g = ctx.getBean(IGestion.class);
            System.out.println("Spring Annotation = " + g.calcul());
        }
    }
}