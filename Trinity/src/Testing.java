import Pramati.Test;

public class Testing extends B{
	{
		System.out.println("Implicity block "+ab);
	}
	
	static{
		System.out.println("Hellow sss");
	}
	
	public Testing() {
		System.out.println("I am constructor");
	}
	
	public static void main(String[] args) {
		Testing testing = new Testing();
		Testing testing2= new Testing();
	}
	
	
	
}

class A implements t{
	int ab=10;
	public A() {
		System.out.println("A Class constructor "+t.a);
	}
	
}

class B extends A{
	public void log() {
		System.out.println(ab);
	}
}

interface t{
    int a=10;
}
