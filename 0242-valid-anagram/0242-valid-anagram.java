class Solution {
  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> count = new HashMap<>();

    // Count the frequency of characters in string s
    for (char x : s.toCharArray()) {
      count.put(x, count.getOrDefault(x, 0) + 1);
    }

    // Decrement the frequency of characters in string t
    for (char x : t.toCharArray()) {
      count.put(x, count.getOrDefault(x, 0) - 1);
    }

    // Check if any character has non-zero frequency
    for (int val : count.values()) {
      if (val != 0) {
        return false;
      }
    }

    return true;
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