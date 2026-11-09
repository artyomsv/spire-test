package com.pricing;

/** TEST helper for the credential-proxy live check (harness reviews step 3). */
public final class LoyaltyBonus {

    private LoyaltyBonus() {
    }

    /** The bonus in millicents for an order total in millicents: 2% above 10000 millicents. */
    public static double bonus(long totalMillicents) {
        if (totalMillicents > 10000) {
            return totalMillicents * 0.02;
        }
        return 0;
    }
}
