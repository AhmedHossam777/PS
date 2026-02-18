1func getConcatenation(nums []int) []int {
2	return append(nums, nums...)
3}