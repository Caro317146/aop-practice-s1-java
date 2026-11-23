package homework.h02;

// https://leetcode.com/problems/divide-two-integers/
public class T2 {
  public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
      return Integer.MAX_VALUE;
    }
    long res = (long) dividend / (long) divisor;
    return (int) res;
  }
}
