1/**
2 * Definition for singly-linked list.
3 * type ListNode struct {
4 *     Val int
5 *     Next *ListNode
6 * }
7 */
8func middleNode(head *ListNode) *ListNode {
9  if head == nil {
10		return nil
11	}
12
13	slowPtr :=head
14	fastPtr :=head
15
16	for fastPtr != nil && fastPtr.Next != nil {
17		slowPtr = slowPtr.Next
18		fastPtr = fastPtr.Next.Next
19	}
20
21	return slowPtr
22}