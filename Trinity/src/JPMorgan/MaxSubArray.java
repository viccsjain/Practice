package JPMorgan;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int N = arr.length;

		int max_so_far = 0;
		int max = 0;
		int start = 0, end = 0;
		for (int i = 0; i < N; i++) {

			max_so_far += arr[i];

			if (max_so_far < 0) {
				max_so_far = 0;
				start = i + 1;
			}
			if (max < max_so_far) {
				max = max_so_far;
				end = i;
			}

		}
		System.out.println(start+"  "+end);
		System.out.println(max);
	}

}
