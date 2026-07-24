package com.test;

import java.math.BigInteger;

//This class's main purpose is to calculate Fibonacci numbers. 
public class FibonacciNumber {

  public static void main(String[] args) {
      FibonacciNumber unknownVariable = new FibonacciNumber();
      System.out.println(unknownVariable.getFibonacciNumber(100));
  }

private BigInteger getFibonacciNumber(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("n must be non-negative: " + n);
    }
    BigInteger previous = BigInteger.ZERO;
    BigInteger current = n == 0 ? BigInteger.ZERO : BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
        BigInteger next = current.add(previous);
        previous = current;
        current = next;
    }
    return current;
}

}
