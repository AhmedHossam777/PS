1func minSubArrayLen(s int, nums []int) int {
2	if len(nums) == 0 {
3		return 0
4	}
5
6	leftPtr := 0
7	smallestWindow := math.MaxInt
8	sum := 0
9	for rightPtr := 0; rightPtr < len(nums); rightPtr++ {
10		sum += nums[rightPtr]
11
12		for sum >= s {
13			windowSize := rightPtr - leftPtr + 1
14			if windowSize < smallestWindow {
15				smallestWindow = windowSize
16			}
17			sum -= nums[leftPtr]
18			leftPtr++
19		}
20	}
21
22	if smallestWindow == math.MaxInt {
23		return 0
24	}
25	return smallestWindow
26}