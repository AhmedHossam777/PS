// Problem: Given an array of integers, return the sum of its elements.
// Example:
// Input: [1, -2, 3, 4]
// Output: 6

const sum = (arr: number[]): number => {
	const sum = arr.reduce((prev, curr) => prev + curr, 0);

	return sum;
};

console.log(sum([1, -2, 3, 4]));
