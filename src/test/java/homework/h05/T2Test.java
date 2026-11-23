package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  @Test
  void test() {
    T2 t2 = new T2();
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    t2.rotate(matrix);
    assertThat(matrix).isDeepEqualTo(new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
  }
}
