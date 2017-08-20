package JPMorgan;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueString {

	public static void main(String[] args) {

		String s = "abcdefgabcedgsdsarjlmmqwklowg";
		System.out.println(s.length());
		Map<Character, Integer> charMap = new HashMap<>();
		char[] arr = s.toCharArray();
		int val = 0;
		int max = 0;
		int maxLoc = -1;
		int temp;
		for (int i = 0; i < s.toCharArray().length; i++) {
			val = 0;
			if (charMap.containsKey(arr[i])) {
				
				temp = charMap.get(arr[i]);
				val = i - temp;
				val = temp > val ? temp: val;
				if (val > max) {
					max = val;
					maxLoc = i;
				}
			}
			charMap.put(arr[i], val);
		}
		
		System.out.println(charMap);

		System.out.println(max);
		System.out.println(arr[maxLoc]);
		System.out.println(s.substring(maxLoc - max, maxLoc));

	}

}
