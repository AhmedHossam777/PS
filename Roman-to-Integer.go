func romanToInt(s string) int {
	romToIntMap := make(map[string]int)
	romToIntMap["I"] = 1
	romToIntMap["V"] = 5
	romToIntMap["X"] = 10
	romToIntMap["L"] = 50
	romToIntMap["C"] = 100
	romToIntMap["D"] = 500
	romToIntMap["M"] = 1000

	total := 0
	for i := 0; i < len(s); i++ {
		char := string(s[i])
		charValue := romToIntMap[char]

		if i+1 < len(s) {
			nextChar := string(s[i+1])
			nextValue := romToIntMap[nextChar]

			if charValue < nextValue {
				total -= charValue
			} else {
				total += charValue
			}
		} else {
			total += charValue
		}
	}

	return total
}