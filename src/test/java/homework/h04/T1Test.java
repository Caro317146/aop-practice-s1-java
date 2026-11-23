package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  @Test
  void test() {
    T1 t1 = new T1();
    assertThat(t1.plusOne(new int[] {1, 2, 3})).containsExactly(1, 2, 4);
    assertThat(t1.plusOne(new int[] {9, 9})).containsExactly(1, 0, 0);
  }
}
