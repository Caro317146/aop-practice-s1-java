package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void example1() {
    assertThat(solution.countPairs(List.of(-1, 1, 2, 3, 1), 2)).isEqualTo(3);
  }

  @Test
  void example2() {
    assertThat(solution.countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2)).isEqualTo(10);
  }

  @Test
  void noPairsLessThanTarget() {
    assertThat(solution.countPairs(List.of(5, 6, 7), 5)).isEqualTo(0);
  }
}
