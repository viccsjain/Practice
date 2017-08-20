package hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringSearch {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String temp;
		int value;
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			temp = in.next();
			value = 1;
			if (map.containsKey(temp)) {
				value = map.get(temp) + value;
			}
			map.put(temp, value);
		}
		int d = in.nextInt();
		String findString;
		for (int i = 0; i < d; i++) {
			findString = in.next();
			if (map.containsKey(findString))
				System.out.println(map.get(findString));
			else
				System.out.println(0);
		}

		in.close();
	}
}
