package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void exampleCases() {
    assertThat(solution.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3))
        .isEqualTo(List.of(true, true, true, false, true));
    assertThat(solution.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1))
        .isEqualTo(List.of(true, false, false, false, false));
    assertThat(solution.kidsWithCandies(new int[] {12, 1, 12}, 10))
        .isEqualTo(List.of(true, false, true));
  }
}
