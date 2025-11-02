// Example 1:

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input will have exactly one solution, and you may not use the same element twice.

// Return the answer in any order.

// Input:
// nums = [2, 7, 11, 15], target = 9

// Output:
// [0, 1]

// Explanation:
// nums[0] + nums[1] == 9 → 2 + 7 = 9

const twoSum = (arr: number[], target: number) => {
  for (let i = 0; i < arr.length; i++) {
    const outerElement = arr[i];
    for (let j = 0; j < arr.length; j++) {
      if (j === i) {
        continue;
      }
      const innerElement = arr[j];
      if (innerElement + outerElement === target) {
        return [i, j];
      }
    }
  }
};

console.log(twoSum([3, 2, 4], 6));
