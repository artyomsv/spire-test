package com.example.billing;

import java.util.List;

public class RefundCalculator {

  public double totalRefund(List<Double> amounts) {
      double total = 0;
      for (Double amount : amounts) {
          total += amount;
      }
      return total;
  }

  public List<String> reasonsFor(String orderId) {
      if (orderId.isEmpty()) {
          return null;
      }
      return List.of("duplicate charge");
  }
}
