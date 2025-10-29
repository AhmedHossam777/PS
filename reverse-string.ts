// Problem: Given a string s, return the string reversed.
// Example:
// Input: "hello"
// Output: "olleh"

const reverseString = (str: string): string => {
	return str.split('').reverse().join('');
};

console.log(reverseString('hello'));
