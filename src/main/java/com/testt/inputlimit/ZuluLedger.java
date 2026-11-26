package com.testt.inputlimit;

/** TEST-input-limit round 1: the last file of the diff. */
public final class ZuluLedger {

    private double balanceInEuros;

    /** Adds a payment to the ledger. */
    public void addPayment(double amountInEuros) {
        balanceInEuros = balanceInEuros + amountInEuros;
    }

    /** The current balance. */
    public double balance() {
        return balanceInEuros;
    }
}
