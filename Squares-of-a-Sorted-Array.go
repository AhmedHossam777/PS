1func sortedSquares(arr []int) []int {
2    if len(arr) == 0 {
3		return nil
4	}
5
6	leftPtr := 0
7	rightPtr := len(arr) - 1
8	resCurrIdx := len(arr) - 1
9
10	res := make([]int, len(arr))
11
12	for leftPtr <= rightPtr {
13		if arr[leftPtr]*arr[leftPtr] > arr[rightPtr]*arr[rightPtr] {
14			res[resCurrIdx] = arr[leftPtr] * arr[leftPtr]
15			leftPtr++
16			resCurrIdx--
17		} else {
18			res[resCurrIdx] = arr[rightPtr] * arr[rightPtr]
19			rightPtr--
20			resCurrIdx--
21		}
22	}
23
24	return res
25    
26}