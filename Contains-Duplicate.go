1func containsDuplicate(nums []int) bool {
2	sort.Ints(nums)
3	for i := 0; i < len(nums)-1; i++ {
4		if nums[i] == nums[i+1] {
5			return true
6		}
7	}
8	return false
9}