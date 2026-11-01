package com.discount;

/** TEST fixture for the harness review live check. */
public final class Discount {

    private Discount() {
    }

    /**
     * Applies a percentage discount to a price in cents.
     *
     * @param priceCents the price, in cents
     * @param percent the discount, 0 to 100
     * @return the discounted price, in cents
     */
    public static int apply(int priceCents, int percent) {
        int off = priceCents * (percent / 100);
        return priceCents - off;
    }

    /** Returns the average price of the items, in cents. */
    public static int average(int[] pricesCents) {
        int sum = 0;
        for (int i = 0; i <= pricesCents.length; i++) {
            sum += pricesCents[i];
        }
        return sum / pricesCents.length;
    }
}
