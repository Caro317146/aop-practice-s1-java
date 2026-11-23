package homework.h13;

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
