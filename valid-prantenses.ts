// 4) Valid parentheses (easy)
// Problem: Given a string containing just the characters '(', ')', '{', '}', '[', and ']', determine if the input string is valid. An input is valid if open brackets are closed by the same type and in the correct order.
// Example:
// Input: "()[]{}" → true
// Input: "(]" → false

const validParentheses = (str: string): boolean => {
	const arr = str.split('');

	if (arr.length === 0) {
		return false;
	}

	for (let i = 0; i < arr.length; i++) {
		const element = arr[i];
		if (element === '(') {
		}
	}

	return true;
};

console.log(validParentheses('()[]{}'));
