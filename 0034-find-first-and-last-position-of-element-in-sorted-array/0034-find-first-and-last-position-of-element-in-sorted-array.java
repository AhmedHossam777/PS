class Solution {
 	public static int[] searchRange(int[] nums, int target) {
		int[] res = {-1, -1};
		if (nums == null || nums.length == 0) {
			return res;
		}

		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] >= target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if (left < nums.length && nums[left] == target) {
			res[0] = left;
		} else {
			return res;
		}

		right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] <= target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		res[1] = right;

		return res;
	}
}