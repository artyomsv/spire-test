package com.pricing;

/** TEST: delivery fee helper for the Claude Code review check. */
public class DeliveryFee {

    /** Returns the delivery fee for an order total, both in millicents. */
    public double feeFor(double orderTotal) {
        if (orderTotal > 50000) {
            return 0;
        }
        return orderTotal * 0.1;
    }
}
