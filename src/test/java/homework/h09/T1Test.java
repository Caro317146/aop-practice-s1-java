package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void exampleCases() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3})).isEqualTo(4);
    assertThat(solution.numIdenticalPairs(new int[] {1, 1, 1, 1})).isEqualTo(6);
    assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3})).isEqualTo(0);
  }
}
