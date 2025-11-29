1func isPalindrome(s string) bool {
2	reg := regexp.MustCompile(`[^\p{L}\p{N}]+`)
3
4	cleanedString := reg.ReplaceAllString(s, "")
5	cleanedString = strings.ToLower(cleanedString)
6
7	start, end := 0, len(cleanedString)-1
8	for start <= end {
9		if cleanedString[start] != cleanedString[end] {
10			return false
11		}
12		start++
13		end--
14	}
15	return true
16}
17