// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

const maxChar = (str: string) => {
	const strArr = str.split("");
	const map = new Map<string, number>();

	// to add element to map
	for (let i = 0; i < str.length; i++) {
		if (!map.has(strArr[i])) {
			map.set(strArr[i], 1);
		} else {
			let value = map.get(strArr[i]) || 1;
			map.set(strArr[i], ++value);
		}
	}

	let maxChar: string = "";
	let max: number = 0;
	for (let [key, value] of map) {
		if (value > max) {
			max = value;
			maxChar = key;
		}
	}

	return maxChar;
};

console.log(maxChar("abcccccccd"));
console.log(maxChar("apple 1231111"));
console.log(maxChar("")); // Empty string - what should it return?
console.log(maxChar("aabbcc")); // Tie - returns first occurrence
console.log(maxChar(" ")); // Single space
console.log(maxChar("a")); // Single character
console.log(maxChar("!!!@@@###")); // Special characters
