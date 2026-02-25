func findNumberOfOnes(num int) int {
	binaryStr := strconv.FormatInt(int64(num), 2)
	numOfOnes := 0

	for i := 0; i < len(binaryStr); i++ {
		if binaryStr[i] == 49 {
			numOfOnes++
		}
	}
	return numOfOnes
}

func sortByBits(arr []int) []int {
	sort.Slice(
		arr, func(i, j int) bool {
			onesI := findNumberOfOnes(arr[i])
			onesJ := findNumberOfOnes(arr[j])

			if onesI == onesJ {
				return arr[i] < arr[j]
			}
			return onesI < onesJ
		},
	)

	return arr
}
