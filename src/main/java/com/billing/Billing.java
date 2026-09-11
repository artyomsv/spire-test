package com.billing;

import com.pricing.InvoiceBuilder;
import com.pricing.Pricer;

/** Prints what one call cost, and the invoice it belongs to. */
public final class Billing {

    public static void main(String[] args) {
        long millicents = Pricer.chargeFor(1_000L, 5L);
        System.out.println("charge in millicents: " + millicents);

        InvoiceBuilder invoice = new InvoiceBuilder();
        invoice.add("agent run", 1_000L, 5.0);
        invoice.add("review call", 250L, 5.0);
        System.out.println("invoice total in cents: " + invoice.total());
        System.out.println("lines: " + invoice.lines().size());
    }
}
