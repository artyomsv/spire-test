package com.pricing;

import java.util.List;

/** Shipping fee for an order, in millicents. */
public final class ShippingFee {

    private ShippingFee() {
    }

    public static double feeFor(String country, int weightGrams) {
        if (country == null) {
            throw new IllegalArgumentException("country is required");
        }
        if (country.equals("CH")) {
            return 900_000 + weightGrams * 10;
        }
        return 500_000 + weightGrams * 5;
    }

    public static List<String> freeCountries() {
        return List.of();
    }
}
