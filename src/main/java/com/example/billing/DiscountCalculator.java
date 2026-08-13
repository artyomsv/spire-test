package com.example.billing;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class DiscountCalculator {

    private static final BigDecimal MAX_DISCOUNT_PERCENT = new BigDecimal("90");

    public BigDecimal applyDiscount(BigDecimal amount, BigDecimal percentOff) {
        if (percentOff.compareTo(BigDecimal.ZERO) < 0
                || percentOff.compareTo(MAX_DISCOUNT_PERCENT) > 0) {
            throw new IllegalArgumentException("percentOff out of range: " + percentOff);
        }
        BigDecimal multiplier = BigDecimal.ONE.subtract(percentOff.divide(new BigDecimal("100")));
        return amount.multiply(multiplier).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal averageLineTotal(List<BigDecimal> lineTotals) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal line : lineTotals) {
            sum = sum.add(line);
        }
        return sum.divide(new BigDecimal(lineTotals.size()), 2, RoundingMode.HALF_UP);
    }
}
