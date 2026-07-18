class Solution {
  public static int[] rightSum(int[] nums) {
    int[] res = Arrays.copyOf(nums, nums.length);

    res[nums.length - 1] = 0;
    for (int i = nums.length - 2; i >= 0; i--) {
      res[i] = res[i + 1] + nums[i + 1];
      //			System.out.println(res[i]);
    }
    //		for (int n : res) System.out.print(n);
    return res;
  }

  public static int[] leftSum(int[] nums) {
    int[] res = Arrays.copyOf(nums, nums.length);

    res[0] = 0;
    for (int i = 1; i < nums.length; i++) {
      res[i] = res[i - 1] + nums[i - 1];
    }
    //		for (int n : res) System.out.print(n);
    return res;
  }

  public int[] leftRightDifference(int[] nums) {
    int[] left = leftSum(nums);
    int[] right = rightSum(nums);

    int[] result = Arrays.copyOf(nums, nums.length);
    for (int i = 0; i < left.length; i++) {
      result[i] = Math.abs(left[i] - right[i]);
    }
    return result;
  }
}