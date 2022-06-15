package com.problem.linkedlist;

public class InsertNodeGivenPostion {

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
		while(current != null) {
			System.out.print(current.data + " ---> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public void insert(int position, int value) {
		ListNode node  = new ListNode(value);
		if(position == 1) {
			node.next = head;
			head = node;
		} else {
			
			ListNode previous = head;
			int count = 1;
			while(count < position -1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}
	}
	
	public static void main(String[] args) {
		InsertNodeGivenPostion list = new InsertNodeGivenPostion();
		list.insert(1, 3);
		list.insert(2, 5);
		list.insert(3, 4);
		list.insert(1, 8);
		list.display();
		
		
	}
}
