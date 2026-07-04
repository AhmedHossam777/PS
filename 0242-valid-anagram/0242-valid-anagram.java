class Solution {
  public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) return false;
    Map<Character, Integer> map = buildMap(s);

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (!map.containsKey(c)) {
				return false;
			}

			int count = map.get(c);
			if (count == 1) {
				map.remove(c);
			} else {
				map.put(c, count - 1);
			}
		}
		return map.isEmpty();
  }

  static HashMap<Character, Integer> buildMap(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (!map.containsKey(s.charAt(i))) {
        map.put(s.charAt(i), 1);
      } else {
        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
      }
    }
    return map;
  }
}