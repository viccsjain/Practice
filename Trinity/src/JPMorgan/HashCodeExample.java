package JPMorgan;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Vikram");
		Employee e2 = new Employee(2, "Vikram");
		System.out.println(e1);
		System.out.println(e2);
		
		e1=e2;
		
		if(e1 == e2)
			System.out.println("Same objects");
		else
			System.out.println("Diff objects");
		
		Set<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		System.out.println(set.size());
		
		if(e1.equals(e2))
			System.out.println("Same value");
		
	}
	
}

class Employee{
	
	int age;
	String name;
	
	public Employee(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	
}
