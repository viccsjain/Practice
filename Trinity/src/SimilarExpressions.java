import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SimilarExpressions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for (int i = 0; i < testCases; i++) {

			List<String> charList = new LinkedList<>();
			List<String> charSecList = new LinkedList<>();

			String firstInput = scanner.next();
			String secondInput = scanner.next();

			char[] arr1 = firstInput.toCharArray();
			char[] arr2 = secondInput.toCharArray();

			stackMe1(arr1, charList);
			stackMe1(arr2, charSecList);

			System.out.println(charList);
			System.out.println(charSecList);

		}
	}

	private static void stackMe1(char[] arr1, List<String> first) {
		boolean isBracketOpen = false;
		boolean isMinusFound = false;
		boolean lastMinus;

		for (int j = 0; j < arr1.length; j++) {
			lastMinus = false;
			if (arr1[j] == '(') {
				isBracketOpen = true;
				if (j > 0) {
					if (arr1[j - 1] == '-') {
						isMinusFound = true;
					}
				}
				continue;
			} else if (arr1[j] == ')') {
				isBracketOpen = false;
				isMinusFound = false;
				continue;
			}

			if (isBracketOpen) {
				if (isMinusFound) {
					if (arr1[j] == '+') {
						first.add("-");
						continue;
					}
				}
			}
			if (arr1[j] != '+')
				first.add(String.valueOf(arr1[j]));
		}

	}

}
