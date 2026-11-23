package homework.h08;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
public class T1 {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
      if (!seen.add(num)) {
        return true;
      }
    }
    return false;
  }
}
