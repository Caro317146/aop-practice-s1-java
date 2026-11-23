package homework.h10;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {
  public char kthCharacter(int k) {
    StringBuilder word = new StringBuilder("a");
    while (word.length() < k) {
      int currentLength = word.length();
      for (int i = 0; i < currentLength; i++) {
        char c = word.charAt(i);
        char next = c == 'z' ? 'a' : (char) (c + 1);
        word.append(next);
      }
    }
    return word.charAt(k - 1);
  }
}
