1func removeDuplicates(nums []int) int {
2	if len(nums) == 0 {
3		return 0
4	}
5
6	writePtr := 1
7
8	for readPtr := 1; readPtr < len(nums); readPtr++ {
9		if nums[readPtr] != nums[writePtr-1] {
10			nums[writePtr] = nums[readPtr]
11			writePtr++
12		}
13	}
14
15	return writePtr
16}