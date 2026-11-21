package com.pricing;

import java.util.List;

/** Shipping fee for an order, in millicents. */
public final class ShippingFee {

    private ShippingFee() {
    }

    public static long feeFor(String country, int weightGrams) {
        if (country == null) {
            throw new IllegalArgumentException("country is required");
        }
        if (country.equals("CH")) {
            return 900_000L + weightGrams * 10L;
        }
        return 500_000L + weightGrams * 5L;
    }

    public static List<String> freeCountries() {
        return List.of();
    }
}
