package homework.h03;

// base
// https://leetcode.com/problems/roman-to-integer/
public class T1 {
  public int romanToInt(String s) {
    int total = 0;
    for (int i = 0; i < s.length(); i++) {
      int cur = value(s.charAt(i));
      if (i + 1 < s.length() && cur < value(s.charAt(i + 1))) {
        total -= cur;
      } else {
        total += cur;
      }
    }
    return total;
  }

  private int value(char c) {
    return switch (c) {
      case 'I' -> 1;
      case 'V' -> 5;
      case 'X' -> 10;
      case 'L' -> 50;
      case 'C' -> 100;
      case 'D' -> 500;
      case 'M' -> 1000;
      default -> 0;
    };
  }
}
