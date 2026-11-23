package homework.h09;

public class T1 {
  public int numIdenticalPairs(int[] nums) {
    int count = 0;
    int[] freq = new int[102]; // Frequency array based on constrains (nums[i] <= 100)
    for (int num : nums) {
      count += freq[num];
      freq[num]++;
    }
    return count;
  }
}
