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
  public boolean isPalindrome(ListNode head) {

    if(head.next == null) return true;
    
		ListNode middleNode = findMiddle(head);
		ListNode secondHead = reverseLinkedlist(middleNode);

		ListNode ptr1 = head;
		ListNode ptr2 = secondHead;
		while (ptr2!=null) {
			if (ptr1.val != ptr2.val) {
				return false;
			}
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		return true;
  }

  public static ListNode reverseLinkedlist(ListNode head) {
    ListNode current = head;
    ListNode prev = null;
    while (current != null) {
      ListNode nextNode = current.next;

      current.next = prev;
      prev = current;
      current = nextNode;
    }

    return prev;
  }

  public static ListNode findMiddle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null&& fast.next!=null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }
}