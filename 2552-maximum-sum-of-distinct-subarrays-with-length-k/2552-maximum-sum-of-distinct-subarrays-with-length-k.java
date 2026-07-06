class Solution {
  public long maximumSubarraySum(int[] nums, int k) {
    	int leftPtr = 0;
		long maxSum = 0;
		long windowSum = 0;

		HashSet<Integer> set = new HashSet<>();
		for (int rightPtr = 0; rightPtr < nums.length; rightPtr++) {
			while (set.contains(nums[rightPtr])) {
				set.remove(nums[leftPtr]);
				windowSum -= nums[leftPtr];
				leftPtr++;
			}
			set.add(nums[rightPtr]);
			windowSum += nums[rightPtr];

			if (set.size() > k) {
				set.remove(nums[leftPtr]);
				windowSum -= nums[leftPtr];
				leftPtr++;
			}

			if (set.size() == k) {
				maxSum = Math.max(windowSum, maxSum);
			}
		}

		return maxSum;
  }
}