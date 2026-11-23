package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void exampleCases() {
    char[] first = new char[] {'h', 'e', 'l', 'l', 'o'};
    solution.reverseString(first);
    assertThat(first).containsExactly('o', 'l', 'l', 'e', 'h');

    char[] second = new char[] {'H', 'a', 'n', 'n', 'a', 'h'};
    solution.reverseString(second);
    assertThat(second).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
  }
}
