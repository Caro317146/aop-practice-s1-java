package homework.h13;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class T2 {
  public int maximumCount(int[] nums) {
    int negatives = 0;
    int positives = 0;
    for (int num : nums) {
      if (num < 0) {
        negatives++;
      } else if (num > 0) {
        positives++;
      }
    }
    return Math.max(negatives, positives);
  }
}
