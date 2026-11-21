package com.pricing;

/** Applies a percentage discount to an order total. */
public final class DiscountHelper {

    private DiscountHelper() {
    }

    public static double applyDiscount(double total, int percent) {
        if (percent > 100) {
            percent = 100;
        }
        return total - total * percent / 100;
    }
}
