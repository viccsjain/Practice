package Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int n, k;
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for (int i = 0; i < testCases; i++) {
			n = scanner.nextInt();
			List<Integer> list = new ArrayList<>();
			int arr[] = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = (scanner.nextInt());
			}
			System.out.println(findPeakPoint1(arr));
		}
	}

	
	private static int findPeakPoint1(int[] arr) {
		int max = 0;
		for(int i=0;i<arr.length;i++){
			if(max < arr[i])
				max = arr[i];
			if(max > arr[i])
				break;
			
		}
		
		return max;
		
	}
	
	private static int findPeakPoint(int[] arr, int start, int end) {
		if(start >= end)
			return arr[start-1];
		int middle = (start + end) / 2;
		int midVal = arr[middle];
		//System.out.println("Comparing "+midVal +"   "+arr[middle-1]);
		if(midVal > arr[middle -1]){
			return findPeakPoint(arr, middle + 1, end);
		}else{
			return findPeakPoint(arr, start, middle -1 );
		}
		
	}

}
