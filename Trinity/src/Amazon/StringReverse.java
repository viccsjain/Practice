package Amazon;

public class StringReverse {

	public static void main(String[] args) {
		String val = "vV";
		String rev = reverseMe(val);
		System.out.println(rev);
	}

	private static String reverseMe(String val) {
		if (val.length() < 1)
			return val;
		else {
			//System.out.println(String.valueOf(val.charAt(val.length() - 1)) );
			return String.valueOf(val.charAt(val.length() - 1)) + reverseMe(val.substring(0, val.length() - 1));
		}
	}

}
