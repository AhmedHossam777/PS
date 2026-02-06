1func firstMissingPositive(nums []int) int {
2	smallest := 1
3	numMap := make(map[int]bool)
4
5	for i := 0; i < len(nums); i++ {
6		if nums[i] <= 0 {
7			continue
8		}
9		numMap[nums[i]] = true
10	}
11
12	for numMap[smallest] {
13		smallest++
14	}
15
16	return smallest
17}