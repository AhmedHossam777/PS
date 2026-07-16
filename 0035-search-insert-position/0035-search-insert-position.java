class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
		int right = nums.length - 1;

		if (target > nums[right]) return nums.length;
		if (target < nums[left]) return 0;

		while (left < right) {
			int mid = (left + right) / 2;
			if (nums[mid] >= target) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}

		return left;
    }
}