import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListImplementation {
	
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Raj");
		linkedList.add("Malhar");
		linkedList.add("Sidh");
		linkedList.add("Rekha");
		
		ListIterator<String> itr = linkedList.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		
		System.out.println(linkedList.get(2));
		
	}

}

