// Given a sorted array of integers nums, remove the duplicates in-place such that each unique element appears only once.
// Return the number of unique elements and modify the array so that the first k elements of nums contain the unique elements in order.
// Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4];

// Output: (k = 5), (nums = [0, 1, 2, 3, 4, _, _, _, _, _]);

const removeDup = (arr: any[]) => {
	const unique = [...new Set(arr)];
	const numOfUnique = unique.length;

	for (let i = 0; i < arr.length; i++) {
		arr[i] = unique[i];
	}
	for (let i = unique.length; i < arr.length; i++) {
		arr[i] = '_';
	}

	return { numOfUnique, arr };
};

console.log(removeDup([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]));
