package com.billing;

public record InvoiceResponse(String id, long amountMillicents, double taxRate) {
}
