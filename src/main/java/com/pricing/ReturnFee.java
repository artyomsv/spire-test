package com.pricing;

/** TEST helper for the credential-proxy final check (harness reviews step 3, seat). */
public final class ReturnFee {

    private ReturnFee() {
    }

    /** The return fee in millicents: free within 14 days, then 300 millicents per day late, at most 3000. */
    public static long fee(int daysAfterDelivery) {
        int late = daysAfterDelivery - 14;
        return late <= 0 ? 0 : Math.min(late * 300, 3000);
    }
}
