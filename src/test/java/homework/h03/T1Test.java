package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  @Test
  void test() {
    T1 t1 = new T1();
    assertThat(t1.romanToInt("III")).isEqualTo(3);
    assertThat(t1.romanToInt("LVIII")).isEqualTo(58);
    assertThat(t1.romanToInt("MCMXCIV")).isEqualTo(1994);
  }
}
