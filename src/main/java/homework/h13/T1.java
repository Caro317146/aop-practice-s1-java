package homework.h13;

// https://leetcode.com/problems/first-bad-version/
public class T1 {
  private int badVersion = 1;
  private int apiCalls = 0;

  public void setFirstBadVersion(int badVersion) {
    this.badVersion = badVersion;
    this.apiCalls = 0;
  }

  public int getApiCalls() {
    return apiCalls;
  }

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

  protected boolean isBadVersion(int version) {
    apiCalls++;
    return version >= badVersion;
  }
}
