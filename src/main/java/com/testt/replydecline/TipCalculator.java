package com.testt.replydecline;

/** TEST-reply-decline: a tip helper for the live test of declined replies. */
public final class TipCalculator {

    private TipCalculator() {
    }

    /** Adds a tip to a bill. */
    public static double withTip(double billInEuros, double tipPercent) {
        return billInEuros + billInEuros * tipPercent / 100;
    }
}
