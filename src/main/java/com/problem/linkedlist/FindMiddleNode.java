package com.problem.linkedlist;


public class FindMiddleNode {
	

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " ---> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public ListNode findMiddle(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode showPtr = head;
		ListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			showPtr = showPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return showPtr;

	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(10);
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(4);
		ListNode head3 = new ListNode(13);
		ListNode head4 = new ListNode(18);
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		
		FindMiddleNode node = new FindMiddleNode();
		node.display(head);
		System.out.println();
		ListNode middle = node.findMiddle(head);
		System.out.println("Middle node data :: "+middle.data);
	}
}
