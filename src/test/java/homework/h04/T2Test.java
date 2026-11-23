package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  @Test
  void test() {
    T2 t2 = new T2();
    assertThat(t2.intToRoman(3)).isEqualTo("III");
    assertThat(t2.intToRoman(58)).isEqualTo("LVIII");
    assertThat(t2.intToRoman(1994)).isEqualTo("MCMXCIV");
  }
}
