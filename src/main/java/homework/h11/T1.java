package homework.h11;

// https://leetcode.com/problems/missing-number/
public class T1 {
  public int missingNumber(int[] nums) {
    int n = nums.length;
    long expectedSum = (long) n * (n + 1) / 2;
    long actualSum = 0;
    for (int num : nums) {
      actualSum += num;
    }
    return (int) (expectedSum - actualSum);
  }
}
