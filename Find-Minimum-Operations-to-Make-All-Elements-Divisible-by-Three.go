func minimumOperations(nums []int) int {
	var max int
	for i := range len(nums) {
		if nums[i]%3 != 0 {
			max++
		}
	}

	return max
}