package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void exampleCases() {
    assertThat(solution.removeDuplicates("abbaca")).isEqualTo("ca");
    assertThat(solution.removeDuplicates("azxxzy")).isEqualTo("ay");
  }
}
