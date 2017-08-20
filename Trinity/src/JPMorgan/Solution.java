package JPMorgan;

import java.util.Scanner;

public class Solution {

	static long buyMaximumProducts(int n, long k, int[] a) {
		// Complete this function
		long[][] T = new long[a.length][2];
		long[] val = new long[a.length];
		for (int i = 0; i < a.length; i++) {

			if (i > 0) {
				// System.out.println(" out " + Math.min((k - val[i-1]) / a[i],
				// (i + 1))+ " "+(k - val[i-1]));
				T[i][1] = Math.max(T[i - 1][1] + Math.min((k - val[i - 1]) / a[i], (i + 1)),
						Math.min(k / a[i], (i + 1)));
				val[i] = Math.min(val[i] + (Math.min((k - val[i]) / a[i], (i + 1)) * a[i]),
						(Math.min(k / a[i], (i + 1)) * a[i]));
				// System.out.println("Value " + val[i]);
			} else {
				if (k > a[i]){
					T[i][1] = 1;
					val[i] = a[i];
				}
			}
			// System.out.println(T[i][1]);
		}
		// for (int i = 0; i < a.length; i++) {
		// System.out.println(" " + T[i][1]);
		// }
		return T[a.length - 1][1];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		long k = in.nextLong();
		if (arr.length > 0 && k > 0) {
			long result = buyMaximumProducts(n, k, arr);
			System.out.println(result);
		} else {
			System.out.println(0);
		}
		in.close();
	}
}