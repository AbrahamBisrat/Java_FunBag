package appleInterview;

import java.util.Arrays;

public class App {
	public static void p(Object line) { System.out.println(line); }
	public static void pA(int[] arr) { p(Arrays.toString(arr)); }

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		findKthElementFromLast(head, 2); // 4
		// findKthElementFromLast(head, 10); // not found
		findKthElementFromLast(head, 5); // 1
	}
	/**
	 * Q. Find the nth element from last in a linked list
	 * list = 1 -> 2 -> 3 -> 4 -> 5
	 * 
	 * findNthLast(list, 2) -> 4
	 * findNthLast(list, 10) -> not found
	 * findNthLast(list, 5) -> 1
	 */
	static void findKthElementFromLast(ListNode head, int k) {
		// required to display the kth element from last;
		int size = 0;
		ListNode current = head;
		
		// while there is a next element, go to the next and update the size
		while(current != null) {
			size++;
			current = current.next;
		}
		// if the total number of nodes is more than or equal to K
		// display size - k + 1
		if(size >= k) {
			current = head;
			for(int i = 0; i < size - k; i++) {
				// traverse to the next element until we get to what we are interested in
				// or the kth value from the last element in the Linked list
				current = current.next;
			}
		}
		p(current.val);
	}
	static class ListNode {
		private int val;
		private ListNode next;
		public ListNode(int val) { this.val = val; }
	}
}
