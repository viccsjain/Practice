import java.util.ArrayList;

public class ArrangePosNegNumber {
	
	public static void main (String[] args)
    {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
        rearrange(arr,n);
        System.out.println("Array after rearranging: ");
        printArray(arr,n);
    }

	private static void printArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + "   ");
	}

	private static void rearrange(int[] arr, int n) {
		int i = -1, temp = 0;
        for (int j = 0; j < n; j++)
        {
            if (arr[j] < 0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
		
        
        
	}
	
	
	// Arraylist
	public void arraylist(){
		ArrayList<Integer> a = new ArrayList<>();
		
	}
	
	

}
