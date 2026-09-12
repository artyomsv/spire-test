package com.pricing;

import java.util.ArrayList;
import java.util.List;

/**
 * Collects the priced calls for one billing period and totals them.
 *
 * <p>Sits between the pricing code and the billing service: {@link Billing} adds a line per call
 * and hands the collected lines over once the period closes.
 */
public final class InvoiceBuilder {

    private final List<InvoiceLineResponse> lines = new ArrayList<>();

    /**
     * Adds one priced call to this invoice.
     *
     * @param description what the call was for
     * @param tokens      tokens consumed
     * @param rateMillicentsPerToken the rate in force, in millicents per token
     */
    public void add(String description, long tokens, long rateMillicentsPerToken) {
        long amount = tokens * rateMillicentsPerToken;
        lines.add(new InvoiceLineResponse(description, amount));
    }

    /**
     * The lines collected so far.
     *
     * @return the lines
     */
    public List<InvoiceLineResponse> lines() {
        return List.copyOf(lines);
    }

    /**
     * The invoice total, converted to cents for the billing service.
     *
     * @return the total in cents
     */
    public double total() {
        long sum = 0L;
        for (InvoiceLineResponse line : lines) {
            sum += line.amount();
        }
        return sum / 100.0;
    }

    /** One priced line on its way to the billing service. */
    public record InvoiceLineResponse(String description, long amount) {
    }
}
