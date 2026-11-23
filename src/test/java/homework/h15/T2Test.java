package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  @Test
  void test() {
    T2 t2 = new T2();
    TreeNode root =
        new TreeNode(
            10,
            new TreeNode(5, new TreeNode(3), new TreeNode(7)),
            new TreeNode(15, null, new TreeNode(18)));
    assertThat(t2.rangeSumBST(root, 7, 15)).isEqualTo(32);
  }
}
