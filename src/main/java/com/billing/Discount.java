package com.billing;

import java.util.List;

/** TEST: a discount helper for the manual review check. */
public class Discount {

    /** Applies a percentage discount to a price. */
    public double apply(double price, int percent) {
        return price - price * percent / 100;
    }

    /** Sums the prices of the given lines. */
    public double total(List<Double> prices) {
        double sum = 0;
        for (Double p : prices) {
            sum += p;
        }
        return sum;
    }
}
