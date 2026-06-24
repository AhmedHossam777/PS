class Solution {
  public int maxArea(int[] height) {
    int leftIdx = 0;
    int rightIdx = height.length - 1;
    int max = 0;
    while (leftIdx < rightIdx) {
      int newMax = Math.min(height[leftIdx], height[rightIdx]) * (rightIdx - leftIdx);
      if (newMax > max) {
        max = newMax;
      }
      if (height[leftIdx] > height[rightIdx]) {
        rightIdx--;
      } else {
        leftIdx++;
      }
    }

    return max;

  }
}