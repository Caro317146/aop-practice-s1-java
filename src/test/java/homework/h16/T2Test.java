package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  @Test
  void test() {
    assertThat(new T2().findJudge(2, new int[][] {{1, 2}})).isEqualTo(2);
    assertThat(new T2().findJudge(3, new int[][] {{1, 3}, {2, 3}})).isEqualTo(3);
    assertThat(new T2().findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 1}})).isEqualTo(-1);
  }
}
