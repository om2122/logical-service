package com.problem.linkedlist;


public class SortedOrder {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " ---> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	
	public ListNode insertDataSortedOrder(int value) {
		ListNode newNode = new ListNode(value);
		ListNode current = head;
		ListNode temp = null;
		
		if(head == null) {
			return newNode;
		}
		
		while(head != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	
	//remove duplicates 
	public void removeDuplicates() {
		if (head == null) {
			return;
		}
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
		
	}
	
	public boolean findValue(int searchKey) {
		if(head == null) { 
			return false;
		}
		ListNode current = head;
		while (current != null) {
			if (current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		SortedOrder node = new SortedOrder();
		node.insertFirst(23);
		node.insertFirst(3);
		node.insertFirst(24);
		node.insertFirst(1);
		node.insertFirst(13);
		node.display();
		System.out.println();
//		boolean isValue = node.findValue(13);
//		System.out.println(isValue);
	}
}
