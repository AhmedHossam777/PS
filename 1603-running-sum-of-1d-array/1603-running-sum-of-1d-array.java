class Solution {
  public int[] runningSum(int[] nums) {
    int[] arrSum = nums;

		arrSum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			arrSum[i] = arrSum[i - 1] + nums[i];
		}

		return arrSum;
  }
}