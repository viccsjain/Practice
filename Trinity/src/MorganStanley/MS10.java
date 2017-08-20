package MorganStanley;

public class MS10 {
	
	public static void main(String[] args) {
		System.out.println("First statement");
		synchronized (args) {
			System.out.println("Second statement");
			try {
				args.wait();
				args.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Third");
		}
		
	}

}
