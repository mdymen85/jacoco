package com.coverage.jacoco;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class MathService {

    public BigDecimal divide(BigDecimal number) {
        if (number == null) {
            return BigDecimal.ZERO;
        }

        if (number.compareTo(BigDecimal.ZERO) == 0) {
            return BigDecimal.ZERO;
        }

        if (number.compareTo(BigDecimal.ONE) < 0) {
            return BigDecimal.ZERO;
        }

        return BigDecimal.TEN.divide(number);

    }

}
