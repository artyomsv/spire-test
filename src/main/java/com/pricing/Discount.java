package com.pricing;

/** Applies promotional discounts to a charge. */
public final class Discount {

    private Discount() {
    }

    /**
     * The charge that remains after a percentage discount is applied.
     *
     * @param chargeMillicents the full charge, in millicents
     * @param percent          the discount to apply, between 0 and 100
     * @return what the customer pays, in millicents
     * @throws IllegalArgumentException if percent is outside 0-100 or chargeMillicents is negative
     */
    public static long afterDiscount(long chargeMillicents, int percent) {
        if (percent < 0 || percent > 100 || chargeMillicents < 0) {
            throw new IllegalArgumentException("invalid discount arguments");
        }
        long discount = (chargeMillicents / 100) * percent + (chargeMillicents % 100) * percent / 100;
        return chargeMillicents - discount;
    }
}
