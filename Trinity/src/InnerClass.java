


public class InnerClass{
	public static void main(String[] args) {
		System.out.println(56 % 98);
		
		System.out.println(gcd(56, 98));
		System.out.println(gcd(7, 2));
		
		
	}
	
	public static int gcd(int a, int b){
		System.out.println("Checking for "+a+"  "+b);
		if(b ==0)
			return a;
		else
			return gcd(b, a % b);
		
		
	}
}