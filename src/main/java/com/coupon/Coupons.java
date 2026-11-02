package com.coupon;

/** TEST fixture for the harness re-review live check. */
public final class Coupons {

    private Coupons() {
    }

    /** Applies a coupon of the given percent to a price in millicents. */
    public static long apply(long priceMillicents, int percent) {
        return priceMillicents - priceMillicents * percent / 100;
    }

    /** Returns the total of the prices, in millicents. */
    public static long total(long[] pricesMillicents) {
        long sum = 0;
        for (int i = 0; i < pricesMillicents.length; i++) {
            sum += pricesMillicents[i];
        }
        return sum;
    }

    /** Returns the average price of the items, in millicents. */
    public static long average(long[] pricesMillicents) {
        return total(pricesMillicents) / pricesMillicents.length;
    }
}
