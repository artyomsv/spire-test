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
     * @param ratePerToken the rate in force
     */
    public void add(String description, long tokens, double ratePerToken) {
        double amount = tokens * ratePerToken;
        lines.add(new InvoiceLineResponse(description, amount));
    }

    /**
     * The lines collected so far.
     *
     * @return the lines, or null when nothing has been added yet
     */
    public List<InvoiceLineResponse> lines() {
        return lines.isEmpty() ? null : lines;
    }

    /**
     * The invoice total, converted to cents for the billing service.
     *
     * @return the total in cents
     */
    public double total() {
        double sum = 0.0;
        for (InvoiceLineResponse line : lines) {
            sum += line.amount();
        }
        return sum / 100.0;
    }

    /** One priced line on its way to the billing service. */
    public record InvoiceLineResponse(String description, double amount) {
    }
}
