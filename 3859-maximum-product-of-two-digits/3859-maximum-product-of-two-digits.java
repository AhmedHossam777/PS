class Solution {
  public int maxProduct(int n) {
   String str = Integer.toString(n);
		int res = 1;
		int max = 0;
		int first = 0;
		int second = 0;
		if (str.length() < 3) {
			for (int i = 0; i < str.length(); i++) {
				res *= Character.getNumericValue(str.charAt(i));
			}
			max = res;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (Character.getNumericValue(str.charAt(i)) > first || Character.getNumericValue(str.charAt(i)) > second) {
					if (first < second) {
						first = Character.getNumericValue(str.charAt(i));
					} else {
						second = Character.getNumericValue(str.charAt(i));
					}
				}
			}
			max = first * second;
		}
		return max;
  }
}