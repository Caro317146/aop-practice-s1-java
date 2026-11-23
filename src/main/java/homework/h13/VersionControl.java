package homework.h13;

public class VersionControl {
  private int firstBadVersion = 1;
  private int apiCalls;

  protected void setFirstBadVersion(int firstBadVersion) {
    this.firstBadVersion = firstBadVersion;
    this.apiCalls = 0;
  }

  protected int getApiCalls() {
    return apiCalls;
  }

  public boolean isBadVersion(int version) {
    apiCalls++;
    return version >= firstBadVersion;
  }
}
