class Solution {
  public boolean isValid(String s) {
    HashMap<Character, Character> pMap = new HashMap<>();
    pMap.put('(', ')');
    pMap.put('{', '}');
    pMap.put('[', ']');

    Stack<Character> characterStack = new Stack<>();
    for (Character c : s.toCharArray()) {
      if (pMap.containsKey(c)) {
        characterStack.push(c);
      } else {
        if (!characterStack.isEmpty() && pMap.get(characterStack.peek()) == c) {
          characterStack.pop();
        } else {
          return false;
        }
      }
    }
    return characterStack.isEmpty();
  }
}