package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  @Test
  void test() {
    T1 t1 = new T1();
    assertThat(t1.addBinary("11", "1")).isEqualTo("100");
    assertThat(t1.addBinary("1010", "1011")).isEqualTo("10101");
  }
}
