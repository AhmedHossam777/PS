class Solution {
  public int longestConsecutive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    int max = 0;
    for (int n : nums) {
      set.add(n);
    }

    for (int num : set) {
      if(set.contains(num-1)){
        continue;
      }
      int count = 1;
      int curr = num;
      while (set.contains(curr + 1)) {
        count++;
        curr++;
      }
      max = Math.max(max, count);
    }

    return max;
  }
}