package com.shipping;

/** TEST fixture for the harness review live check (API key). */
public final class Shipping {

    private Shipping() {
    }

    /** Returns the shipping fee for a parcel weight in grams: free from 5000 grams. */
    public static long feeMillicents(long grams) {
        if (grams > 5000) {
            return 0;
        }
        return grams * 10;
    }
}
