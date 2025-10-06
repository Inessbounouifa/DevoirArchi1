package org.sid.devoirarchi1.presentation;

import org.sid.devoirarchi1.metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
        IGestion g = ctx.getBean(IGestion.class);
        System.out.println("Spring XML = " + g.calcul());
    }
}