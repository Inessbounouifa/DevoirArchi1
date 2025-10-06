package org.sid.devoirarchi1.dao;

import org.springframework.stereotype.Component;

@Component("calculV1")
public class CalculV1 implements ICalcul {
    @Override
    public double getValue() {
        return 100;
    }
}