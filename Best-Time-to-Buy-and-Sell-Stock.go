1func maxProfit(prices []int) int {
2	buyPtr := 0
3	profit := 0
4
5	for sellPtr := 1; sellPtr < len(prices); sellPtr++ {
6		if prices[sellPtr] > prices[buyPtr] {
7			diff := prices[sellPtr] - prices[buyPtr]
8			if diff > profit {
9				profit = diff
10			}
11		} else {
12			buyPtr = sellPtr
13		}
14	}
15
16	return profit
17}
18