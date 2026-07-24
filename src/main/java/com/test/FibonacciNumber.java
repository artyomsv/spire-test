package com.test;


//This class's main purpose is to calculate Fibonacci numbers. 
public class FibonacciNumber {

  public static void main(String[] args) {
      FibonacciNumber unknownVariable = new FibonacciNumber();
      System.out.println(unknownVariable.getFibonacciNumber());
  }

private int getFibonacciNumber(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("n must be non-negative: " + n);
    }
    int previous = 0;
    int current = n == 0 ? 0 : 1;
    for (int i = 2; i <= n; i++) {
        current += previous;
        previous = current - previous;
    }
    return current;
}

}
