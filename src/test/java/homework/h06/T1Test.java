package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  @Test
  void test() {
    T1 t1 = new T1();
    assertThat(t1.reverseWords("Let's take LeetCode contest"))
        .isEqualTo("s'teL ekat edoCteeL tsetnoc");
    assertThat(t1.reverseWords("Mr Ding")).isEqualTo("rM gniD");
  }
}
