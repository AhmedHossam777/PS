1func lengthOfLongestSubstring(s string) int {
2	if len(s) == 0 {
3		return 0
4	}
5
6	seen := make(map[uint8]bool)
7	leftIdx := 0
8	maxWindowSize := 0
9	for rightIdx := 0; rightIdx < len(s); rightIdx++ {
10		for seen[s[rightIdx]] {
11			delete(seen, s[leftIdx])
12			leftIdx++
13		}
14
15		seen[s[rightIdx]] = true
16		windowSize := rightIdx - leftIdx + 1
17
18		if windowSize > maxWindowSize {
19			maxWindowSize = windowSize
20		}
21
22	}
23
24	return maxWindowSize
25}