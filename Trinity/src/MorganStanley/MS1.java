package MorganStanley;

public class MS1 {
	
	public static String s = "-";
	public static void main(String[] args) {
		
		new MS1().s1();
		System.out.println(s);
		
	}

	private void s1() {
		try {
			s2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			s += "c";
		}
		
	}

	private void s2() throws Exception{
		
		s3();
		System.out.println("After me");
		s3();
		System.out.println("fff");
	}

	private void s3() throws Exception {
		throw new Exception();
		
	}

}
