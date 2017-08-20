package Pramati;

public class LinkedListMoveLastToFirst {

	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Function to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		LinkedListMoveLastToFirst llist = new LinkedListMoveLastToFirst();
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		System.out.println("Linked List before moving last to front ");
		llist.printList();

		llist.moveToFront();

		System.out.println("Linked List after moving last to front ");
		llist.printList();
	}

	private void moveToFront() {
		Node lastNode = null;
		Node temp = head;
		Node prev = null;
		if(temp == null)
			return;
		while(temp.next != null){
			prev = temp;
			lastNode = temp.next;
			temp = temp.next;
		}
		
		prev.next = null;
		lastNode.next = head;
		head = lastNode;
		
		
		
		
	}

	private Node removeDuplicates() {
		Node temp = head;
		if (temp == null)
			return temp;
		else {
			while (temp.next != null) {
				if (temp.data == temp.next.data) {
					temp.next = temp.next.next;
				} else {
					temp = temp.next;
				}
			}
		}
		return head;

	}

}
