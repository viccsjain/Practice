import java.io.IOException;

class Parent {
	void msg() throws IOException {
		System.out.println("parent");
		throw new IOException();
	}
	
	void temp() throws IOException{
		msg();
	}
}

class TestExceptionChild5 extends Parent {
	void msg() {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild5();
		//p.msg();
	}
}