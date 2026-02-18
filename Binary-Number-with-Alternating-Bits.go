1func hasAlternatingBits(n int) bool {
2	binaryStr := strconv.FormatInt(int64(n), 2)
3
4	fmt.Println(binaryStr)
5	fmt.Println(len(binaryStr))
6
7	for i := 0; i < len(binaryStr)-1; i++ {
8		if binaryStr[i] == binaryStr[i+1] {
9			return false
10		}
11	}
12
13	return true
14}