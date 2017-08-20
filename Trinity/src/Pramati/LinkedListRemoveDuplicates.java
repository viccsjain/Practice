package Pramati;

public class LinkedListRemoveDuplicates {

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
	 public void push(int new_data)
	    {
	        /* 1 & 2: Allocate the Node &
	                  Put in the data*/
	        Node new_node = new Node(new_data);
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head;
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node;
	    }
	 
	    /* Function to print linked list */
	     void printList()
	     {
	         Node temp = head;
	         while (temp != null)
	         {
	            System.out.print(temp.data+" ");
	            temp = temp.next;
	         }  
	         System.out.println();
	     }
	 

	public static void main(String args[]) {
		LinkedListRemoveDuplicates llist = new LinkedListRemoveDuplicates();
		llist.push(20);
		llist.push(13);
		llist.push(13);
		llist.push(11);
		llist.push(11);
		llist.push(11);

		System.out.println("List before removal of duplicates");
		llist.printList();

		llist.removeDuplicates();

		System.out.println("List after removal of elements");
		llist.printList();
	}

	private Node removeDuplicates() {
		Node temp = head;
		if(temp == null)
			return temp;
		else{
			while(temp.next != null){
				if(temp.data == temp.next.data){
					temp.next = temp.next.next;
				}else{
					temp = temp.next;
				}
			}
		}
		return head;
		
	}

}
