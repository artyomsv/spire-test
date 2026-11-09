package com.pricing;

/** TEST helper for the credential-proxy live check (harness reviews step 3, API key). */
public final class GiftWrap {

    private GiftWrap() {
    }

    /** The gift-wrap fee in millicents for a number of items: 500 millicents each, at most 5 items charged. */
    public static long fee(int items) {
        int charged = items > 5 ? 5 : items;
        return charged * 500;
    }
}
