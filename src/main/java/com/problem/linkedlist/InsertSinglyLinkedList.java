package com.problem.linkedlist;


public class InsertSinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
		
	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " ---> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		InsertSinglyLinkedList list = new InsertSinglyLinkedList();
//		list.insertFirst(11);
//		list.insertFirst(8);
//		list.insertFirst(1);
//		list.insertFirst(10);
		
		list.insertLast(10);
		list.insertLast(1);
		list.insertLast(8);
		list.display();
				
	}

}
