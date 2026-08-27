package com.pricing;

/** Prices one model call. */
public final class Pricer {

    private Pricer() {
    }

    /**
     * The charge for a single call, in millicents.
     *
     * <p>Millicents, not cents: a per-token rate is far below one cent, so a coarser unit
     * would round every small call to zero.
     *
     * @param tokens                 tokens consumed, must not be negative
     * @param rateMillicentsPerToken the rate in force, in millicents per token
     * @return the charge in millicents
     */
    public static long chargeFor(long tokens, long rateMillicentsPerToken) {
        if (tokens < 0) {
            throw new IllegalArgumentException("tokens must not be negative");
        }
        return tokens * rateMillicentsPerToken;
    }
}
