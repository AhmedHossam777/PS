/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode leader = dummy;
		ListNode trailer = dummy;
		int flag = 0;
//
//		if (head.next == null) {
//			return null;
//		}

		while (leader.next != null) {
			if (flag < n) {
				flag++;
			} else {
				trailer = trailer.next;
			}
			leader = leader.next;
		}

		trailer.next = trailer.next.next;

		return dummy.next;
  }
}