package hackerrank;

import java.util.Scanner;

public class Temporary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long arr[] = new long[n];
		long max = 0;
		for (int a0 = 0; a0 < m; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			for (int j = a - 1; j <= b - 1; j++) {
				arr[j] += k;
				if (max < arr[j])
					max = arr[j];
			}
		}
		System.out.println(max);
		in.close();
	}

}
