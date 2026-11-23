package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  @Test
  void test() {
    T2 t2 = new T2();
    assertThat(t2.divide(10, 3)).isEqualTo(3);
    assertThat(t2.divide(7, -3)).isEqualTo(-2);
  }
}
