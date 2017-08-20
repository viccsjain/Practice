package MSys;

enum Season {
	WINTER {
		void help() {
			System.out.println("Winter helped");
		}
	},
	RAINY {
		void help() {
			System.out.println("Rainy helped");
		}
	};

	abstract void help();

}

public class SetTest {

	static void m(int i) {
		System.out.println("Integer");
	}

	static void m(Integer i) {
		System.out.println(i);
		System.out.println("Integer...");
	}

	public static void main(String args[]) {
		Season a = Season.RAINY;
		a.help();
		long b = 30;
		m(b);
	}

	private static void m(double a) {
		System.out.println("double");
	}

	public static void main1(String[] args) {

		long startTime = System.nanoTime();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer: " + (System.nanoTime() - startTime) + "ms");
		startTime = System.nanoTime();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder: " + (System.nanoTime() - startTime) + "ms");

		String s1 = new String("Vikram");
		String s2 = new String("Vikram");
		s1 = "Vikram";
		s2 = "Vikram";
		if (s1 == s2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
