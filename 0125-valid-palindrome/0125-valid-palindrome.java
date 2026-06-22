class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) {
			return true;
		}

		int leftIdx = 0;
		int rightIdx = s.length() - 1;

		while (leftIdx < rightIdx) {
			// first we need to skip the non-alphanumeric characters
			while (leftIdx < rightIdx && !Character.isLetterOrDigit(s.charAt(leftIdx))) {
				leftIdx++;

			}
			while (leftIdx < rightIdx && !Character.isLetterOrDigit(s.charAt(rightIdx))) {
				rightIdx--;
			}

			if (Character.toLowerCase(s.charAt(leftIdx)) != Character.toLowerCase(s.charAt(rightIdx))) {
				return false;
			}
			leftIdx++;
			rightIdx--;
		}

		return true;
    }
}