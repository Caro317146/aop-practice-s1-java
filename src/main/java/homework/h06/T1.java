package homework.h06;

// base
// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class T1 {
  public String reverseWords(String s) {
    String[] parts = s.split(" ");
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < parts.length; i++) {
      if (i > 0) {
        res.append(" ");
      }
      res.append(new StringBuilder(parts[i]).reverse());
    }
    return res.toString();
  }
}
