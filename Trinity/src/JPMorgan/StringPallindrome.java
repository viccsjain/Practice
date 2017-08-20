package JPMorgan;

public class StringPallindrome {

	public static void main(String[] args) {

		String a = "forgeekslskeegfor";
		char[] arr = a.toCharArray();
		int[] counter = new int[arr.length];
		temp(arr);

	}

	public static int temp(char[] arr) {
		int max = 0, val = 0;
		for (int i = 0; i < arr.length; i++) {
			val = isSame(arr, i, 1)+1;
			System.out.println(arr[i] + "   " + val);
			if (val > max)
				max = val;
		}
		return max;
	}

	public static int isSame(char[] arr, int i, int counter) {
		if ((i - counter) >= 0 && (i + counter) <= arr.length - 1) {
			if (arr[i - counter] == arr[i + counter])
				return isSame(arr, i, ++counter) + 2;

		}
		return 0;
	}

}
