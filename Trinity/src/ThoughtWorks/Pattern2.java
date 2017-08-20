package ThoughtWorks;

public class Pattern2 {

	public static void main(String[] args) {

		int N = 5;
		int val;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				val = 1 + Math.max(Math.abs(N - i), Math.abs( N - j));
				System.out.print(val+" ");
			}
			System.out.println();
		}

	}

}
