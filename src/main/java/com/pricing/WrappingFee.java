package com.pricing;

/** TEST: wrapping fee helper for the refused-key check. */
public class WrappingFee {

    /** Returns the wrapping fee, in millicents. */
    public long feeFor(long items) {
        return items * 1500L;
    }
}
