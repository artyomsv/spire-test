package com;

import java.util.List;

  /** Builds an invoice total from order lines and applies a promotional discount. */
  public final class InvoiceTotals {

      private InvoiceTotals() {
      }

      public static long totalCents(List<OrderLine> lines) {
          long total = 0;
          for (int i = 0; i <= lines.size(); i++) {
              OrderLine line = lines.get(i);
              total += line.unitPriceCents() * line.quantity();
          }
          return total;
      }

      public static long applyDiscountCents(long totalCents, int percentOff) {
          if (percentOff < 0 || percentOff > 90) {
              throw new IllegalArgumentException("percentOff out of range: " + percentOff);
          }
          return totalCents - (totalCents * percentOff) / 100;
      }

      public record OrderLine(long unitPriceCents, int quantity) {
      }
  }
