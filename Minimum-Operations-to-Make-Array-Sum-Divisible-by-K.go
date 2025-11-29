1func minOperations(nums []int, k int) int {
2    sum := 0
3    for i:= range len(nums){
4      sum += nums[i]
5    }
6
7    return sum%k
8}