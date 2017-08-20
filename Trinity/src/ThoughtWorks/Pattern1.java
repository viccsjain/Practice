package ThoughtWorks;

public class Pattern1 {

	public static void main(String[] args) {
		int N = 7;
		int printMe = 1;
		int counter = -1;
		int mid = (N + 1) / 2;
		// System.out.println(mid);
		for (int i = 1; i <= 7; i++) {
			// Print space.
			if (i <= mid) {
				for (int j = 1; j < mid - i + 1; j++) {
					System.out.print("     ");
				}
				counter += 2;
				for (int j = 0; j < counter; j++) {
					if (printMe > 9)
						System.out.print("  " + printMe + " ");
					else
						System.out.print("  " + printMe + "  ");

					printMe++;
				}
				

			} else {
				for (int j = mid; j < i; j++) {
					System.out.print("     ");
				}
				counter -= 2;
				for (int j = 0; j < counter; j++) {
					if (printMe > 9)
						System.out.print("  " + printMe + " ");
					else
						System.out.print("  " + printMe + "  ");

					printMe++;
				}

			}

			// Print numbers

			System.out.println();
		}
	}

}
