package hackerrank;

public class LinkedListImplementation {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	int FindMergeNode(Node headA, Node headB) {
		if (headA == null || headB == null)
			return -1;
		int sizeA = 0, sizeB = 0;
		Node temp = headA;
		while (temp != null) {
			sizeA++;
			temp = temp.next;
		}

		temp = headB;
		while (temp != null) {
			sizeB++;
			temp = temp.next;
		}
		Node[] arrayA = new Node[sizeA];
		Node[] arrayB = new Node[sizeB];
		int i = 0;
		temp = headA;
		while (temp != null) {
			arrayA[i] = temp;
			temp = temp.next;
		}

		i = 0;
		temp = headB;
		while (temp != null) {
			arrayB[i] = temp;
			temp = temp.next;
		}

		i = sizeA;
		int j = sizeB;
		Node lastSameNode = null;
		while (i >= 0 && j >= 0) {
			if(arrayA[i] == arrayB[j]){
				lastSameNode = arrayA[i];
			}else{
				if(lastSameNode != null){
					return lastSameNode.data;
				}else{
					return -1;
				}
			}
			
			i--;
			j--;
		}

		return -1;
	}

	public static void main(String[] args) {
		LinkedListImplementation impl = new LinkedListImplementation();
		Node node = impl.new Node(1);
		node.next = impl.new Node(3);
		node.next.next = impl.new Node(5);
		node.next.next.next = impl.new Node(7);
		node.next.next.next.next = impl.new Node(9);

		Node node2 = impl.new Node(2);
		node2.next = impl.new Node(4);
		node2.next.next = impl.new Node(6);
		node2.next.next.next = impl.new Node(8);
		node2.next.next.next.next = impl.new Node(10);

		impl.printList(node);
		System.out.println();
		// impl.printList(impl.Reverse(node));
		impl.printList(impl.merge(node, node2));

	}

	private Node merge(Node node, Node node2) {
		if (node == null && node2 == null)
			return null;
		if (node == null)
			return node2;
		if (node2 == null)
			return node;
		Node head = null, temp = null;
		Node first = node;
		Node second = node2;
		while (first != null && second != null) {
			if (first.data < second.data) {
				System.out.println("Comparing " + first.data + "  " + second.data);
				if (head == null) {
					temp = first;
					head = temp;
				} else {
					temp.next = first;
					temp = temp.next;
				}
				first = first.next;
			} else {
				if (head == null) {
					temp = second;
					head = temp;
				} else {
					temp.next = second;
					temp = temp.next;
				}
				second = second.next;
			}

		}

		while (first != null) {
			temp.next = first;
			temp = temp.next;
			first = first.next;
		}

		while (second != null) {
			temp.next = second;
			temp = temp.next;
			second = second.next;
		}

		return head;
	}

	private void printList(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			printList(node.next);
		}
	}

	Node Reverse(Node head) {

		if (head == null)
			return null;
		else {
			Node nextNewNode = null, holdNext = null;
			Node temp = head;
			while (temp != null) {

				holdNext = temp.next;
				temp.next = nextNewNode;
				nextNewNode = temp;
				temp = holdNext;
			}
			head = nextNewNode;
			return head;
		}
	}

}
