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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode list1 = l1;
		ListNode list2 = l2;
		ListNode dummy = new ListNode();
		ListNode current = dummy;

		int carry = 0;
		while (list1 != null || list2 != null || carry != 0) {
			int digit1 = (list1 != null) ? list1.val : 0;
			int digit2 = (list2 != null) ? list2.val : 0;

			int sum = digit1 + digit2 + carry;
			carry = sum / 10;

			current.next = new ListNode(sum % 10);
			current = current.next;

			if (list1 != null) list1 = list1.next;
			if (list2 != null) list2 = list2.next;
		}

		return dummy.next;

  }
}