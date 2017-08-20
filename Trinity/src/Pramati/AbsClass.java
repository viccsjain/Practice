package Pramati;

public  class AbsClass {
	
	
	
	
	public static void main(String[] args) {
		Node node = new Node(2);
		node.next = new Node(3);
		node.next.next = new Node(20);
		printList(node);
		
		Node secNode = new Node(1);
		secNode.next = new Node(2);
		secNode.next.next = new Node(10);
		secNode.next.next.next = new Node(15);
		secNode.next.next.next.next = new Node(25);
		printList(secNode);
		
		Node newList = mergeLinkedLists(node, secNode);
		printList(newList);
	}

	private static void printList(Node newList) {
		while(newList != null){
			System.out.print("|"+newList.data+" | -> ");
			newList = newList.next;
		}
		System.out.println();

		
	}

	private static Node mergeLinkedLists(Node first, Node sec) {
		Node newList = null;
		Node newTemp = newList;
		while(first != null && sec != null){
			//System.out.println("Loop");
			if(first.data < sec.data){
				if(newList == null){
					newList = first;
					newTemp = first;
				}
				else{
					newTemp.next = first;
					newTemp = newTemp.next;
				}	
				
				first = first.next;
			}else{
				if(newList == null){
					newList = sec;
					newTemp = sec;
				}
				else{
					newTemp.next = sec;
					newTemp = newTemp.next;
				}	
				sec = sec.next;
			}
		}
		
		while(first != null){
			//System.out.println("First");
			newTemp.next = first;
			newTemp = newTemp.next;
			first = first.next;
		}
		while(sec != null){
			//System.out.println("Sec");
			newTemp.next = sec;
			newTemp = newTemp.next;
			sec = sec.next;
		}
		return newList;
	}
	
	
	
	
}

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.next = null;	
		this.data = data;
	}
}
