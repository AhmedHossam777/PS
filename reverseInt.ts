// --- Directions
// Given an integer, return an integer that is the reverse
// ordering of numbers.
// --- Examples
//   reverseInt(15) === 51
//   reverseInt(981) === 189
//   reverseInt(500) === 5
//   reverseInt(-15) === -51
//   reverseInt(-90) === -9

const reverseInt = (num: number): number => {
	const sign = num < 0 ? -1 : 1;
	const numArr = `${num * sign}`.split("");

	return Number(numArr.reverse().join("")) * sign;
};

console.log(reverseInt(900));
console.log(reverseInt(981));
console.log(reverseInt(500));
console.log(reverseInt(-15));
console.log(reverseInt(-90));
