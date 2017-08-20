import java.util.ArrayList;

public class ArrayListImplementation {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("vikram");
		list.add("Ram");
		list.add("shyam");
		list.add("Reena");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Reena");
		list2.add("Preeti");
		list2.add("Payal");


		System.out.println("List 1");
		list2.removeAll(list);
		for (String name : list2)
			System.out.print(name + " ");
		
		list.addAll(list2);
		list.addAll(list2);
		System.out.println("\nList 2");
		for (String name : list)
			System.out.print(name + " ");
		System.out.println();
		for (String name : list2)
			System.out.print(name + " ");
		
	

	}

}
