//“almost palindrome” version (where one mismatch is allowed)
const almostPlandirome = (s: string): boolean => {
	const clean = s
		.toLowerCase()
		.replace(/[^a-z0-9]/g, ''); // keep only letters and numbers
	
	const origStr = clean.split('')
	const reversedStr = clean.split('').reverse();
	
	
	let numOfErrors = 0;
	for (let i = 0; i < reversedStr.length; i++) {
		if (origStr[i] !== reversedStr[i]) {
			numOfErrors += 1;
			if (numOfErrors > 1) {
				return false;
			}
		}
	}
	
	return true
}

// Examples
console.log(almostPlandirome("daa&%d"));     // true  (clean: "daad", palindrome)
console.log(almostPlandirome("racecar"));   // true  (palindrome)
console.log(almostPlandirome("abcdef"));    // false (multiple mismatched pairs)
console.log(almostPlandirome("A man, a plan, a canal: Panama")); // true
