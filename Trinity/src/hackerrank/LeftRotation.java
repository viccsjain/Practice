package hackerrank;

import java.util.Scanner;

public class LeftRotation {

	static int[] leftRotation(int[] a, int d) {
		int N = a.length;
		if (d > N) {
			d = N / d + (N % d);
		}
		int middle = N / 2;
		int tempArr[] = new int[N];
		int temp;
		for (int i = 0; i < N; i++) {
			if (i <= d) {
				System.out.println(i+ " " +d+"  "+N);
				tempArr[i] = a[(i + d + 1) % N];
			} else {
				
				tempArr[i] = a[i - d];
			}
		}
		return tempArr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}

}
