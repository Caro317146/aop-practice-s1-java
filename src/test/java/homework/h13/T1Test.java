package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void exampleCases() {
    solution.setFirstBadVersion(4);
    assertThat(solution.firstBadVersion(5)).isEqualTo(4);

    solution.setFirstBadVersion(1);
    assertThat(solution.firstBadVersion(1)).isEqualTo(1);
  }

  @Test
  void largeRangeWithoutOverflow() {
    solution.setFirstBadVersion(1_702_766_719);
    assertThat(solution.firstBadVersion(2_126_753_390)).isEqualTo(1_702_766_719);
    assertThat(solution.getApiCalls()).isLessThanOrEqualTo(32);
  }
}
