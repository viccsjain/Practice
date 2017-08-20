package ThoughtWorks;

public class SolveSudoku {

	public static void main(String[] args) {
		// 0 means unassigned cells
		int N = 9;
		int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		//printGrid(grid);
		if (SolveSudoku(grid) == true)
			printGrid(grid);
		else
			System.out.println("No solution exists");

	}

	private static void printGrid(int[][] arr) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

	private static void printRow(int[][] arr, int i) {
		for (int k = 0; k <= i + 1; k++) {
			for (int j = 0; j < 9; j++) {
				if (k < 9)
					System.out.print(" " + arr[k][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------------------");
	}

	private static boolean SolveSudoku(int[][] arr) {
		boolean isAdded;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] == 0) {
					isAdded = false;
					for (int k = 1; k < 10; k++) {
						if (canBeAdded(arr, k, i, j) && SolveSudoku(arr)) {
							isAdded = true;
							break;
						} else {
							arr[i][j] = 0;
							// System.out.println(k + " can not be added at " +
							// i + " " + j);

							//printRow(arr, i);
						}
					}
					if (!isAdded)
						return false;
				}
			}
		}
		return true;
	}

	private static boolean canBeAdded(int[][] arr, int n, int i, int j) {
		// check if num found in row and col
		for (int k = 0; k < 9; k++) {
			if (arr[i][k] == n)
				return false;
			if (arr[k][j] == n)
				return false;
		}

		int L = getCordinate(i);
		int M = getCordinate(j);
		for (int k = L; k < L + 3; k++) {
			for (int p = M; p < M + 3; p++) {
				if (arr[k][p] == n)
					return false;
			}
		}

		arr[i][j] = n;

		return true;
	}

	private static int getCordinate(int i) {

		if (i >= 0 && i <= 2)
			return 0;
		else if (i >= 3 && i <= 5)
			return 3;
		else
			return 6;

	}

}
