import java.util.HashSet;
import java.util.Set;

public class Program implements Cloneable {

	int a;
	int b;

	public Program() {
		a = 3;
		b = 5;
	}

	public static void main(String[] args) {

		String a = "abc";
		String b = a.intern();
		System.out.println(b);

		System.out.println(a == b);
		System.out.println(a.equals(b));

		ShortSetTest test = new ShortSetTest();
		test.temp(args);

		//
		// int data[][] = {{123},{1,2,3}};
		//
		// int cop[][] = data.clone();
		// System.out.println(data[0][0]);
		// cop[0][0]= 100;
		// System.out.println(data[0][0]);
		// System.out.println(cop[0][0]);
		// cop[1] = new int[]{4,5,6};
		//
		// System.out.println(data[1][0]);
		// System.out.println(cop[1][0]);
		//

		//
		// int a[] = {10};
		// int b[] = a.clone();
		// System.out.println(a[0]);
		// System.out.println(b[0]);
		// b[0]=20;
		// System.out.println(a[0]);
		// System.out.println(b[0]);
		//
		//

		//
		//
		// int[] arr = getCharCountArray("arihant");
		// System.out.println("arihant".charAt(0));
		// int[] coin = new int[1];
		//
		// coin['a']=1;
		// System.out.println(coin[0]);
		//
		// for (int i : arr) {
		// if (i != 0)
		// System.out.println(i);
		// }
	}

	static final int NO_OF_CHARS = 256;

	/*
	 * Returns an array of size 256 containg count of characters in the passed
	 * char array
	 */
	static int[] getCharCountArray(String str) {
		int count[] = new int[NO_OF_CHARS];

		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;

		return count;
	}

}

class ShortSetTest {
	public static void temp(String[] args) {
		Set shortSet = new HashSet();
		// shortSet.add(17);
		for (short i = 18; i < 20; i++) {
			shortSet.add(i);
			System.out.println(shortSet);
			if (shortSet.contains((short) (i - 1)))
				System.out.println("found");
			System.out.println(shortSet.remove((short) (i - 1)));
		}

		System.out.println(shortSet);
	}
}
