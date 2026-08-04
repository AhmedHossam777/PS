class Solution {
  public List<Integer> findMissingElements(int[] nums) {
   	if (nums.length == 1) return List.of(nums[0]);

		List<Integer> result = new ArrayList<>();
		int[] sorted = Arrays.stream(nums).sorted().toArray();

		for (int i = 0; i < sorted.length - 1; i++) {
			while (sorted[i + 1] - sorted[i] != 1) {
				sorted[i]++;
				result.add(sorted[i]);
			}
		}

		return result;
  }
}