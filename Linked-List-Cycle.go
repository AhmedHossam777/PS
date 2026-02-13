1/**
2 * Definition for singly-linked list.
3 * type ListNode struct {
4 *     Val int
5 *     Next *ListNode
6 * }
7 */
8func hasCycle(head *ListNode) bool {
9  if(head==nil){
10    return false
11  }
12  fast := head
13  slow := head
14  for fast != nil && fast.Next!=nil{
15    fast = fast.Next.Next
16    slow = slow.Next
17    if(fast == slow){
18      return true
19    }
20  }
21
22  return false
23}