class Solution {
  public int maxProduct(int n) {
    String str = Integer.toString(n);
		int res = 1;
		int max = 0;
		if (str.length() < 3) {
			for (int i = 0; i < str.length(); i++) {
				res *= Character.getNumericValue(str.charAt(i));
			}
      max = res;
		} else {
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str.length(); j++) {
					if (i == j) continue;
					res = Character.getNumericValue(str.charAt(i)) * Character.getNumericValue(str.charAt(j));
					if (max < res) max = res;
				}
			}
		}
		return max;
  }
}