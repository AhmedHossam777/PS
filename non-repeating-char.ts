// 3) First non-repeating character
// Problem: Given a string s, return the index of the first non-repeating character. If none exists, return -1.
// Example:
// Input: "leetcode"
// Output: 0 (‘l’ is non-repeating and first)
// Input: "aabb"
// Output: -1

const firstNonRepeating = (str: string): number => {
	const arr = str.split('');

	for (let i = 0; i < arr.length; i++) {
		let repeated = 0;
		const element = arr[i];
		for (let j = 0; j < arr.length; j++) {
			if (arr[j] === element) {
				repeated += 1;
			}
		}
		if (repeated === 1) {
			return i;
		}
	}

	return -1;
};

console.log(firstNonRepeating('aab'));
