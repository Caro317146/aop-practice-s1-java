package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  @Test
  void test() {
    T2 t2 = new T2();
    assertThat(t2.reverse(123)).isEqualTo(321);
    assertThat(t2.reverse(-123)).isEqualTo(-321);
    assertThat(t2.reverse(120)).isEqualTo(21);
  }
}
