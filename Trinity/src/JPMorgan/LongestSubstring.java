package JPMorgan;

public class LongestSubstring {

	public static void main(String[] args) {
		String a = "VikramChhajer";
		String b = "VikramChhajer";

		System.out.println(findLongestSubString(a, b));

	}

	private static String findLongestSubString(String a, String b) {
		char[] mainStr = a.toCharArray();
		char[] finderStr = b.toCharArray();
		int rows = finderStr.length+1;
		int cols = mainStr.length+1;
		int arr[][] = new int[finderStr.length + 1][mainStr.length + 1];
		int max = 0, maxRow = 0, maxCol;
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (finderStr[i-1] == mainStr[j-1]) {

					arr[i][j] = arr[i - 1][j - 1] + 1;
					if (arr[i][j] > max) {
						max = arr[i][j];
						maxRow = i;
						maxCol = j;
					}
				}
			}
		}
		System.out.println(max);
		//printMatrix(arr, rows, cols);

		return b.substring(maxRow - max, maxRow);
	}

	private static void printMatrix(int[][] mat, int rows, int col) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
