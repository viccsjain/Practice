package JPMorgan;

public class IsCoinsAvailable {

	public static void main(String[] args) {
		int sum =13;
		int coins[] = new int[] { 1, 4, 6, 8 };
		int mat[][] = new int[coins.length][sum + 1];
		int rows = coins.length;
		int col = sum + 1;

		for (int i = 0; i < rows; i++)
			mat[i][0] = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 1; j < col; j++) {
				// System.out.println(i + " " + j);
				if (coins[i] > j) {
					mat[i][j] = mat[i - 1][j];
				} else if (coins[i] == j) {
					mat[i][j] = 1;
				} else {
					if (i > 0)
						mat[i][j] = Math.min(mat[i][j - coins[i]] + 1, mat[i - 1][j]);
					else
						mat[i][j] = mat[i][j - coins[i]] + 1;
				}
			}
		}

		System.out.println("Coins required");
		printMatrix(mat, rows, col);

		rows = rows - 1;
		col = col - 1;
		int temp = sum;

		while (sum > 0) {
			
			System.out.println("\n"+rows+" "+col +"  "+ mat[rows][col]);
			if (mat[rows][col] != mat[rows - 1][col]) {
				System.out.print(" if "+coins[rows]);
				sum -= coins[rows];
				if (mat[rows][col - coins[rows]] == 0) {
					break;
				}
				rows = rows - 1;
				col = col - coins[rows - 1];
			} else {
				while(rows > 0 && mat[rows][col] == mat[rows - 1][col]){
					rows = rows-1;
				}
				System.out.print(" else "+coins[rows]);
				sum -= coins[rows];
				col = col - coins[rows];
			}
			
			//System.out.println(rows+"  "+col);
		}

		// System.out.println(mat[3][11]);

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
