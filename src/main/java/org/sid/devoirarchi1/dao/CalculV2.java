package org.sid.devoirarchi1.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("calculV2")
@Primary
public class CalculV2 implements ICalcul {
    @Override
    public double getValue() {
        return 150;
    }
}