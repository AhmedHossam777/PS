1func isPalindrome(x int) bool {
2	if x < 0 {
3		return false
4	}
5	xStr := strconv.Itoa(x)
6	rightPtr := len(xStr) - 1
7	leftPtr := 0
8
9	for rightPtr > leftPtr {
10		if xStr[leftPtr] != xStr[rightPtr] {
11			return false
12		}
13		leftPtr++
14		rightPtr--
15	}
16
17	return true
18}