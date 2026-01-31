1func findMaxAverage(nums []int, k int) float64 {
2	currSum := 0
3	for i := 0; i < k; i++ {
4		currSum += nums[i]
5	}
6
7	maxSum := currSum
8
9	for i := k; i < len(nums); i++ {
10		currSum += nums[i] - nums[i-k]
11
12		if currSum > maxSum {
13			maxSum = currSum
14		}
15	}
16
17	return float64(maxSum) / float64(k)
18}