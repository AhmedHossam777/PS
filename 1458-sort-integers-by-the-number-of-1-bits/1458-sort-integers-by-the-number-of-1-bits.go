func sortByBits(arr []int) []int {
	sort.Slice(arr, func(i, j int) bool {
		onesI := bits.OnesCount(uint(arr[i]))
		onesJ := bits.OnesCount(uint(arr[j]))
		
		if onesI == onesJ {
			return arr[i] < arr[j]
		}
		return onesI < onesJ
	})
	
	return arr
}