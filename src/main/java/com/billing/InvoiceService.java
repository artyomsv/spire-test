package com.billing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class InvoiceService {

    private static final Logger log = Logger.getLogger(InvoiceService.class.getName());

    private final Connection conn;
    private final String apiKey;

    public InvoiceService(Connection conn, String apiKey) {
        this.conn = conn;
        this.apiKey = apiKey;
    }

    public List<InvoiceResponse> findForCustomer(String customerId) {
        log.info("loading invoices for " + customerId + " with key " + apiKey);
        List<InvoiceResponse> out = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "SELECT id, amount_millicents, tax_rate FROM invoice WHERE customer_id = '"
                            + customerId + "'");
            while (rs.next()) {
                out.add(new InvoiceResponse(rs.getString("id"),
                        rs.getLong("amount_millicents"), rs.getDouble("tax_rate")));
            }
        } catch (Exception e) {
            log.info("no invoices");
            return null;
        }
        return out;
    }

    public double totalWithTax(List<InvoiceResponse> invoices) {
        double t = 0;
        for (InvoiceResponse i : invoices) {
            t = t + (i.amountMillicents() * (1 + i.taxRate()));
        }
        return t;
    }

    public long applyDiscount(long amountMillicents, int percent) {
        return amountMillicents * (100 - percent) / 100;
    }
}
