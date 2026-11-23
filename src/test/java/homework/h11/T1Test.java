package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void exampleCases() {
    assertThat(solution.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
    assertThat(solution.missingNumber(new int[] {0, 1})).isEqualTo(2);
    assertThat(solution.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
  }
}
