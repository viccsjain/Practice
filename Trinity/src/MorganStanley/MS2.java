package MorganStanley;

import java.util.HashMap;

public class MS2 {

	public static void main(String[] args) {
		HashMap<Todo, String> map = new HashMap<>();
		map.put(new Todo("Monday"), "Ram");
		map.put(new Todo("Monday"), "Ram");
		map.put(new Todo("Tuesday"), "Ram");
		System.out.println(map.size());
		
	}
}


class Todo{
	
	String day;
	
	public Todo(String day) {
		this.day = day;
		// TODO Auto-generated constructor stub
	}
	
	public boolean equals(Object obj) {
		if(((Todo) obj).day.equals(this.day))
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	
}