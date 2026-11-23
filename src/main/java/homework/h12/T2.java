package homework.h12;

public class T2 {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] count = new int[1001];
    for (int num : arr1) {
      count[num]++;
    }

    int[] result = new int[arr1.length];
    int index = 0;

    for (int num : arr2) {
      while (count[num] > 0) {
        result[index++] = num;
        count[num]--;
      }
    }

    for (int val = 0; val < count.length; val++) {
      while (count[val] > 0) {
        result[index++] = val;
        count[val]--;
      }
    }

    return result;
  }
}
