package com.problem.linkedlist;

public class DeleteNode {

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

	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;

	}

	public ListNode deleteFirst() {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	public ListNode deleteLast() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	public void delete(int position) {
		if(position == 1) {
			head = head.next;
		}
		ListNode previous = head;
		int count = 1;
		while (count < position-1) {
			previous = previous.next;
			count++;
		}
		
		ListNode current = previous.next;
		previous.next = current.next;
	}
	
	public void deleteNode(int key) {
		ListNode current = head;
		ListNode temp = null;
		
		if(current !=null && current.data == key) {
			head = current.next;
			return;
		}
		
		while(current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if(current == null) {
			return;
		}
		
		temp.next = current.next;
	}

	public static void main(String[] args) {
		DeleteNode list = new DeleteNode();
		list.insertFirst(10);
		list.insertFirst(3);
		list.insertFirst(8);
		list.insertFirst(1);
		list.insertFirst(7);
		list.display();
//		System.out.println();
//		System.out.println(list.deleteFirst().data);
//		list.display();
//		System.out.println();
//		System.out.println(list.deleteLast().data);
//		list.display();
//		
//		System.out.println();
//		list.delete(2);
//		list.display();
		System.out.println();
		list.deleteNode(8);
		list.display();
		
		
		
	}
}
