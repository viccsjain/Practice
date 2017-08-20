package JPMorgan;

public class Inheritance {

	public static void main(String[] args) {

	}

}

class Aa {

	private void add() {
		System.out.println("Aa add function");
	}

}

class B extends Aa {

	void add() {
		System.out.println("B add function");
	}

}
