class Solution {
  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> map1 = buildMap(s);
    Map<Character, Integer> map2 = buildMap(t);

    String testedString = s.length() > t.length() ? s : t;

    for (int i = 0; i < testedString.length(); i++) {
      if (!Objects.equals(map1.get(testedString.charAt(i)), map2.get(testedString.charAt(i)))) {
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