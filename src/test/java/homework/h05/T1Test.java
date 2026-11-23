package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  @Test
  void test() {
    T1 t1 = new T1();
    assertThat(t1.longestCommonPrefix(new String[] {"flower", "flow", "flight"})).isEqualTo("fl");
    assertThat(t1.longestCommonPrefix(new String[] {"dog", "racecar", "car"})).isEqualTo("");
  }
}
