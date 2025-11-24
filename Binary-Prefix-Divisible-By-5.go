
func prefixesDivBy5(nums []int) []bool {
	var resNum = []bool{}
	temp := 0
	for i := range len(nums) {
		temp = (temp*2 + nums[i]) % 5

		resNum = append(resNum, temp%5 == 0)
	}

	return resNum
}