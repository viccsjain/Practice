package ThoughtWorks;

public class ExpressSum {

	public static void main(String[] args) {
		int N = 100;
		int power = 2;

		System.out.println(findSum(N, power, 1));

	}

	private static int findSum(int n, int power, int i) {
		int diff = (int) (n - Math.pow(i, power));
		if (diff < 0)
			return 0;
		else if (diff == 0)
			return 1;
		else
			return findSum(diff, power, i + 1) + findSum(n, power, i + 1);
	}
}
