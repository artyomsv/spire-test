package com.testt.inputlimit;

/** TEST-input-limit round 3: the last file of the diff, money now in long millicents. */
public final class ZuluLedger {

    private long balanceInMillicents;

    /** Adds a payment to the ledger. */
    public void addPayment(long amountInMillicents) {
        balanceInMillicents = balanceInMillicents + amountInMillicents;
    }

    /** The current balance. */
    public long balance() {
        return balanceInMillicents;
    }
}
