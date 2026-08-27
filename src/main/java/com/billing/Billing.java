package com.billing;

import com.pricing.Pricer;

/** Prints what one call cost. */
public final class Billing {

    public static void main(String[] args) {
        long cents = Pricer.chargeFor(1_000L, 5L);
        System.out.println("charge in cents: " + cents);
    }
}
