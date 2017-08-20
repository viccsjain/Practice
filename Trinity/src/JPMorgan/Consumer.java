package JPMorgan;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> list;

	public Consumer(List<Integer> list) {
		this.list = list;
	}

	public void consume() throws InterruptedException {
		int i=0;
		while (i<10) {
			synchronized (list) {
				while (list.size() == 0) {
					System.out.println("WAiting " + Thread.currentThread().getName());
					list.wait();
				}
				int val = list.remove(0);
				System.out.println("Consumed value: (" + Thread.currentThread().getName() + ") " + val);
				list.notify();

			}
			Thread.sleep(1000);
			i++;
		}
	}

	public void run() {
		try {
			consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
