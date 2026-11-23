package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void exampleCases() {
    assertThat(solution.kthCharacter(5)).isEqualTo('b');
    assertThat(solution.kthCharacter(10)).isEqualTo('c');
  }
}
