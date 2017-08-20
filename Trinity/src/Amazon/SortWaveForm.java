package Amazon;

public class SortWaveForm {

	public static void main(String args[]) {
		SortWaveForm ob = new SortWaveForm();
		int arr[] = { 10, 90, 49, 2, 1, 5, 23 };
		int n = arr.length;
		ob.sortInWave(arr, n);
		for (int i : arr)
			System.out.print(i + " ");
	}

	private void sortInWave(int[] arr, int n) {
		int temp;
		for (int i = 1; i < n; i = i + 2) {
			if (arr[i - 1] < arr[i]) {
				temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
			}

			if (arr[i + 1] < arr[i]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;

			}
		}
	}

}
