package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  @Test
  void test() {
    T2 t2 = new T2();
    assertThat(t2.myAtoi("42")).isEqualTo(42);
    assertThat(t2.myAtoi("   -042")).isEqualTo(-42);
    assertThat(t2.myAtoi("1337c0d3")).isEqualTo(1337);
  }
}
