package com.testt;

//This class's main purpose is to calculate Fibonacci numbers. 
public class FibonacciNumber {

  public static void main(String[] args) {
      FibonacciNumber calculator = new FibonacciNumber();
      System.out.println(calculator.getFibonacciNumber(10));
  }

  private long getFibonacciNumber(int n) {
    if (n < 0) throw new IllegalArgumentException("n must be non-negative");
    if (n < 2) return n;
    long prev = 0, curr = 1;
    for (int i = 2; i <= n; i++) {
      long next = prev + curr;
      prev = curr;
      curr = next;
    }
    return curr;
  }

}
