package JPMorgan;

import java.util.Scanner;

public class HackerrankString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			// your code goes here

			String h = "HackerRank".toLowerCase();

			char[] arr = h.toCharArray();
			int val;
			int counter = 0;
			for (int i = 0; i < arr.length; i++) {
				if (s.length() < h.length() - counter) {
					System.out.println("NO");
					return;
				}
				if (s.contains(String.valueOf(arr[i]))) {
					val = s.indexOf(String.valueOf(arr[i]));
					s = s.substring(val + 1, s.length());
					counter++;
				} else {
					System.out.println("NO");
					return;
				}
			}
			System.out.println("YES");
		}
	}
}
