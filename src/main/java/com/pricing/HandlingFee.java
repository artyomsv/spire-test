package com.pricing;

/** TEST: handling fee helper for the Claude Code canary check. */
public class HandlingFee {

    /** Returns the handling fee for an order total, both in millicents. */
    public float feeFor(float orderTotal) {
        return orderTotal * 0.05f;
    }
}
