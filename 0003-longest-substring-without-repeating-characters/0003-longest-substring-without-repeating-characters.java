class Solution {
  public int lengthOfLongestSubstring(String s) {
   	int leftPtr = 0;
		HashSet<Character> characterHashSet = new HashSet<>();
		int max = 0;

		for (int rightPtr = 0; rightPtr < s.length(); rightPtr++) {
			while (characterHashSet.contains(s.charAt(rightPtr))) {
				characterHashSet.remove(s.charAt(leftPtr));
				leftPtr++;
			}

			characterHashSet.add(s.charAt(rightPtr));
			max = Math.max(max, rightPtr - leftPtr + 1);
		}

		return max;
  }
}