class Solution {
  public int[] twoSum(int[] numbers, int target) {
    if (numbers.length == 0)
      return new int[] {};

    int leftIdx = 0;
    int rightIdx = numbers.length - 1;

    while (leftIdx < rightIdx) {
      int res = numbers[leftIdx] + numbers[rightIdx];
      if (res == target) {
        return new int[] { leftIdx+1, rightIdx+1 };
      }
      if (res > target) {
        rightIdx--;
      } else {
        leftIdx++;
      }
    }

    return new int[] {};
  }
}