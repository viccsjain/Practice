package JPMorgan;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> list;

	public Producer(List<Integer> list) {
		this.list = list;
	}

	public void produce() throws InterruptedException {
		int i=0;
		while (i < 10) {
			synchronized (list) {
				while (list.size() == ThreadImplementation.N) {
					System.out.println("Producer waitng ");
					list.wait();
				}
				int val = (int) (Math.random() * 50 + 1);
				list.add(val);
				System.out.println("Produced value: " + val);
				list.notify();

			}
			Thread.sleep(1000);
			i++;
		}

	}

	public void run() {
		try {
			produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
