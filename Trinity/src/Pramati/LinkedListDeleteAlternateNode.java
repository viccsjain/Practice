package Pramati;

public class LinkedListDeleteAlternateNode {

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
		LinkedListDeleteAlternateNode llist = new LinkedListDeleteAlternateNode();

		/* Constructed Linked List is 1->2->3->4->5->null */
		// llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		System.out.println("Linked List before calling deleteAlt() ");
		llist.printList();
		llist.head = llist.reverse(llist.head, 3);
		
		System.out.println("Linked List after calling deleteAlt() ");
		llist.printList();
	}
	public LinkedListDeleteAlternateNode.Node reverse(LinkedListDeleteAlternateNode.Node head2, int i) {
		
		
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
