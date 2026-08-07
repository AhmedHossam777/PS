class Solution {
  public String longestCommonPrefix(String[] strs) {
   StringBuilder res = new StringBuilder();
		for (int i = 0; i < strs[0].length(); i++) {
			char currentChar = strs[0].charAt(i);
			boolean isInAll = true;
			for (int j = 1; j < strs.length; j++) {
				if (i >= strs[j].length() || currentChar != strs[j].charAt(i)) {
					isInAll = false;
					break;
				}
			}
			if (!isInAll) {
				break;
			}
			res.append(currentChar);
		}

		return res.toString();
  }
}