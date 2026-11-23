package homework.h12;

import java.util.Arrays;

public class T1 {
  public int heightChecker(int[] heights) {
    int[] expected = Arrays.copyOf(heights, heights.length);
    Arrays.sort(expected);

    int mismatches = 0;
    for (int i = 0; i < heights.length; i++) {
      if (heights[i] != expected[i]) {
        mismatches++;
      }
    }
    return mismatches;
  }
}
