class Solution {
  public int lengthOfLongestSubstring(String s) {
   	HashMap<Character, Integer> lastSeen = new HashMap<>();
		int max = 0;
		int leftPtr = 0;

		for (int rightPtr = 0; rightPtr < s.length(); rightPtr++) {
			char c = s.charAt(rightPtr);
			if (lastSeen.containsKey(c) && lastSeen.get(c) >= leftPtr) {
				leftPtr = lastSeen.get(c) + 1;
			}
			lastSeen.put(c, rightPtr);
			max = Math.max(max, rightPtr - leftPtr + 1);
		}
		return max;
  }
}