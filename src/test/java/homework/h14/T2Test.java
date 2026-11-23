package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  @Test
  void exampleCase() {
    T2.MyQueue myQueue = new T2.MyQueue();
    myQueue.push(1);
    myQueue.push(2);
    assertThat(myQueue.peek()).isEqualTo(1);
    assertThat(myQueue.pop()).isEqualTo(1);
    assertThat(myQueue.empty()).isFalse();
  }
}
