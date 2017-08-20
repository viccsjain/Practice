package ThoughtWorks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SuperDigitSum {

	static int getLargestNumberWithPrimeOccurences(int[] inputArray, int minOccurence) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int val, key;
		for (int i = 0; i < inputArray.length; i++) {
			val = 1;
			key = inputArray[i];
			if (map.containsKey(key)) {
				val = map.get(key) + val;
			}
			map.put(key, val);
		}

		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			key = itr.next();
			Integer value = map.get(key);
			if (value < minOccurence) {
				itr.remove();
			}
		}

		System.out.print(map);
		return 0;
	}

	static class Node {
		int weight;
		Node left;
		Node right;

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(int w) {
			this.weight = w;
		}

	}

	static String getOutcomeOfTheFeat(int[] weights, int marginOfError) {
		List<Integer> list = new ArrayList();
		for (int i = 0; i < weights.length; i++)
			list.add(weights[i]);
		System.out.println(list);
		Collections.sort(list);
		int res = output(list);

		// System.out.print(res);
		if (res == 0)
			return "Perfectly Balanced";
		else if (res <= marginOfError) {
			return "Balanced with in " + res;
		} else
			return "Not Balanced";
	}

	static int output(List<Integer> list) throws StackOverflowError {
		if (list.size() == 0)
			return 0;

		if (list.size() == 1)
			return list.get(0);

		int last = list.get(list.size() - 1);
		int secLast = list.get(list.size() - 2);

		int res = last - (secLast + 1);
		list.remove(list.size() - 1);
		list.remove(list.size() - 1);

		if (res != 0) {
			list.add(res);
			// System.out.println("adding new " + res);
		}
		// System.out.println(list);
		Collections.sort(list);
		return output(list);
	}

	public static void main(String[] args) {

		try {
			int[] weights = { 1, 2, 3, 4, 5, 6 };
			int diff = 1;
			int[] weights2 = { 4, 10, 20, 50, 100 };
			int diff2 = 20;

			getOutcomeOfTheFeat(weights, diff);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}

	}

	private static String findsum(String p) {
		// TODO Auto-generated method stub
		if (p.length() == 1)
			return p;
		else {
			long sum = 0;
			for (int i = 0; i < p.length(); i++) {
				sum += Integer.parseInt(String.valueOf(p.charAt(i)));
			}
			// System.out.println(sum);
			return findsum(String.valueOf(sum));
		}
	}

}
