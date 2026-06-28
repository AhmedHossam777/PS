class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      hashMap.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (hashMap.containsKey(complement) && hashMap.get(complement) != i) {
        int[] arr = { i, hashMap.get(complement) };
        return arr;
      }
    }

    return new int[] {};
  }
}