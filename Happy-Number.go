1func getSquareSum(num int) int {
2	var sum int
3	for num > 0 {
4		lastDigit := num % 10
5		sum += lastDigit * lastDigit
6		num = num / 10
7	}
8	fmt.Println(sum)
9	return sum
10}
11
12func isHappy(n int) bool {
13	seen := make(map[int]bool)
14
15	for n != 1 {
16		if seen[n] {
17			return false
18		}
19		seen[n] = true
20		n = getSquareSum(n)
21	}
22
23	return true
24}
25