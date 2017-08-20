package Amazon;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = new int[] { 21, 3, 55, 43, 78, 12, 7, 90 };

		mergeSort(arr, 0, arr.length - 1);
		printArr(arr);

	}

	private static void printArr(int[] arr) {
		for (int i : arr)
			System.out.print(i +" ");
		System.out.println();

	}

	private static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(arr, start, middle);
			mergeSort(arr, middle + 1, end);

			mergeBoth(arr, start, middle, end);
		}
	}

	private static void mergeBoth(int[] arr, int l, int m, int r) {
		
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];

	
		for (int i = 0; i < n1; i++) {
			L[i] = arr[l+i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = arr[m + 1 + i];
		}
		
		printArr(L);
		printArr(R);
		System.out.println("Merging now");

		
		int r1 = 0, r2 = 0;
		int s = l;
		while (r1 < n1 && r2 < n2) {
			if (L[r1] < R[r2]) {
				arr[s] = L[r1];
				r1++;
			} else {
				arr[s] = R[r2];
				r2++;
			}
			s++;
		}

		/* Copy remaining elements of L[] if any */
		while (r1 < n1) {
			arr[s] = L[r1];
			r1++;
			s++;
		}

		/* Copy remaining elements of R[] if any */
		while (r2 < n2) {
			arr[s] = R[r2];
			r2++;
			s++;
		}
		printArr(arr);

	}

}
