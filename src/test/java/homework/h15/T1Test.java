package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void exampleCases() {
    TreeNode first =
        new TreeNode(
            4,
            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            new TreeNode(7, new TreeNode(6), new TreeNode(9)));
    TreeNode invertedFirst = solution.invertTree(first);
    assertThat(invertedFirst.val).isEqualTo(4);
    assertThat(invertedFirst.left.val).isEqualTo(7);
    assertThat(invertedFirst.left.left.val).isEqualTo(9);
    assertThat(invertedFirst.left.right.val).isEqualTo(6);
    assertThat(invertedFirst.right.val).isEqualTo(2);
    assertThat(invertedFirst.right.left.val).isEqualTo(3);
    assertThat(invertedFirst.right.right.val).isEqualTo(1);

    TreeNode second = new TreeNode(2, new TreeNode(1), new TreeNode(3));
    TreeNode invertedSecond = solution.invertTree(second);
    assertThat(invertedSecond.val).isEqualTo(2);
    assertThat(invertedSecond.left.val).isEqualTo(3);
    assertThat(invertedSecond.right.val).isEqualTo(1);

    assertThat(solution.invertTree(null)).isNull();
  }
}
