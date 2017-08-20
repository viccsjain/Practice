package MorganStanley;

public class Question2 {
	
	static int element;

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6, 7, 8, 9, 1, 2 };
		int pos = 7;
		element = 8;
		int loc;
		if (arr[0] > 8) {
			loc=searchElement(arr, pos, arr.length - 1);
		} else {
			loc=searchElement(arr, 0, pos - 1);
		}
		System.out.println(loc);
	}

	private static int searchElement(int[] arr, int start, int end) {
		if(start >= end)
			return -1;
		int median = (start + end) / 2;
		System.out.println(start+"  "+end +"  "+ arr[median]);
		if(arr[median] == element)
			return median;
		if(arr[start] == element)
			return start;
		if(arr[median] == element)
			return end;
		
		if(arr[median] < element)
			return searchElement(arr, median+1, end);
		else
			return searchElement(arr, start, median-1);
	}

}
