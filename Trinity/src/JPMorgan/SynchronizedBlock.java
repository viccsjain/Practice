package JPMorgan;

public class SynchronizedBlock {

	public void table(int n) {

		System.out.println("Thread-> " + Thread.currentThread().getName() + " trying to access");
		synchronized (SynchronizedBlock.class) {
			try {
				System.out.println("Thread-> " + Thread.currentThread().getName() + " using function");
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Releasing now");
		}
		System.out.println("Thread-> " + Thread.currentThread().getName() + " out now");

	}

	public static void main(String[] args) {
		
		
		
		
		String temp="Vikram";
		String a1 = new String("Vikram");
		String b1 = new String("Vikram");
		
		if(temp.equals(a1))
			System.out.println("Same string");
		if(a1 != temp)
			System.out.println("Diff references");
		
		if (a1 == b1) {
			System.out.println("Same strings");
		} else {
			System.out.println("Diff string");
		}

		a1 = "Vikram";
		b1 = "Vikram";
		if (a1 == b1) {
			System.out.println("Same strings");
		} else {
			System.out.println("Diff string");
		}

		String s = "Vikram";

		System.out.println("sachin".hashCode());
		System.out.println("tendulkar".hashCode());

		localInner2 loca = new localInner2();
		loca.display();

		Integer a = new Integer(10);
		Integer b = new Integer(10);
		if (a == b)
			System.out.println("Both are same");
		else
			System.out.println("Both are different");

		if (a.equals(b))
			System.out.println("Both are same");
		else
			System.out.println("Both are different");

		int x = a;
		int y = b;
		if (x == y)
			System.out.println("Both are same");
		else
			System.out.println("Both are different");

		SynchronizedBlock block = new SynchronizedBlock();
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				block.table(10);
			}
		}, "FirstThread");

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				block.table(10);
			}
		}, "Secondthread");

		t1.start();
		t2.start();

	}

}

class localInner2 {
	private int data = 30;// instance variable

	void m() {

		n();

		// throw new java.io.IOException("device error");// checked exception
	}

	void n() throws ArithmeticException {

	}

	void display() {
		m();
		int value = 50;// local variable must be final till jdk 1.7 only
		class Local {
			void msg() {
				System.out.println(value + data);
			}
		}
		Local l = new Local();
		l.msg();
	}
}

enum Season {
	WINTER, RAINY;
}
