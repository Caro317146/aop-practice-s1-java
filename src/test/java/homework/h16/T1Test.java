package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  @Test
  void test() {
    int[][] grid = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
    int[][] expected = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
    assertThat(new T1().floodFill(grid, 1, 1, 2)).isDeepEqualTo(expected);
  }
}
