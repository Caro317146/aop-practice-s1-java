class Solution { public int findMaxConsecutiveOnes(int[] nums) { int m = 0, c = 0; for (int n : nums) { if (n == 1) { c++; if (c > m) m = c; } else { c = 0; } }
