package Pramati;

import java.util.Hashtable;

public class Threading extends a{

	public static void main(String[] args) {
		
		Thread.currentThread().setName("Main Method Thread");
		System.out.println(Thread.currentThread().getName());
		
		
		Hashtable<String, Integer> table = new Hashtable<>();
		table.put("Viksa", 2);
		
	}
	
	
	
	
}

class a {
	public final void log(){
		System.out.println("Final class log");
	}
}

interface b {
	public void log();
}
