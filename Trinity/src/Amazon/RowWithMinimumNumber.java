package Amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RowWithMinimumNumber {

	public static void main(String[] args) {
		int row, col;
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for (int i = 0; i < testCases; i++) {
			row = scanner.nextInt();
			col = scanner.nextInt();
			List<Integer> list = new ArrayList<>();
			int arr[][] = new int[row][col];
			int result[] = new int[row];
			for (int j = 0; j < row; j++) {
				result[j] = 0;
				for (int k = 0; k < col; k++) {
					arr[j][k] = scanner.nextInt();
					result[j] = result[j] + arr[j][k];
				}
			}
			for(int k=0; k< row; k++)
				System.out.println(result[k]);
			int max=(row > col ? row : col) + 1;
			int output= -1;
			for(int j=0;j<row;j++)
			{
				if(max > result[j] && result[j] != 0){
					max = result[j];
					output = j;
				}
			}
			System.out.println(output);

		}
	}

}
