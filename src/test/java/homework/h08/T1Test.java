package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  @Test
  void test() {
    T1 t1 = new T1();
    assertThat(t1.containsDuplicate(new int[] {1, 2, 3, 1})).isTrue();
    assertThat(t1.containsDuplicate(new int[] {1, 2, 3, 4})).isFalse();
  }
}
