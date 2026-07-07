class Solution {
  public double findMaxAverage(int[] nums, int k) {
		if (nums.length == 1) return nums[0];

		double maxAvg = Double.NEGATIVE_INFINITY;
		int leftIdx = 0;
		double windowSum = 0;

		for (int rightIdx = 0; rightIdx < nums.length; rightIdx++) {
			if (rightIdx - leftIdx > k - 1) {
				windowSum -= nums[leftIdx];
				leftIdx++;
			}
			windowSum += nums[rightIdx];
			System.out.println(windowSum);
			if (rightIdx - leftIdx == k - 1) {
				maxAvg = Math.max(windowSum / k, maxAvg);
			}
		}

		return maxAvg;
  }
}