import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum season{
	WINTER,
	RAINY
}

class Tree implements Plant{

	@Override
	public boolean box() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

interface Plant{
	boolean box();
}

public class FinalClassObject {

	public static void main(String[] args) {
		List<Plant> plants = new ArrayList<Plant>();
		List<? extends Plant> trees = plants;
		  Plant plant = trees.get(0);
		  
		try {
			Class rth=  Class.forName("Tree");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		season s = season.values()[0];
		Employee emp = new Employee("Vikram", "39");
		System.out.println(emp);
		emp.setAge("21");
		emp.setName("Viksa");
		System.out.println(emp);
		modifyMe(emp);
		System.out.println(emp);
		//synchronized (emp) {
			try {
				emp.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//}
		// emp = new Employee();
	}

	private void test(final int i) {

	}

	private static void modifyMe(final Employee emp) {
		// emp = new Employee("Raj","2");

	}

}

class Employee {

	private String name;
	private String age;

	public Employee() {

	}

	public Employee(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}

}
