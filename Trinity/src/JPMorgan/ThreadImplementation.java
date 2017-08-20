package JPMorgan;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadImplementation {

	public static final int N = 10;

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(N);
//		Producer producer = new Producer(list);
//		Consumer consumer = new Consumer(list);
//		Consumer consumer1 = new Consumer(list);
//		Consumer consumer2 = new Consumer(list);
//		Consumer consumer3 = new Consumer(list);
//		ExecutorService service = Executors.newFixedThreadPool(10);
//		service.submit(producer);
//		service.submit(consumer);
//		service.submit(consumer1);
//		service.submit(consumer2);
//		
//
//		service.shutdown();
		
		
		ThreadGroup threadGroup = new ThreadGroup("MainGroup");
		Producer prod1 = new Producer(list);
		Consumer consumer = new Consumer(list);
		Thread thread1 = new Thread(threadGroup, prod1);
		Thread thread2 = new Thread(threadGroup, consumer);
		thread1.start();
		thread2.start();
		System.out.println(threadGroup.activeCount());
		threadGroup.suspend();
		
		try {
			Thread.sleep(10000);
			threadGroup.resume();
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadGroup.destroy();
		
		
		ThreadLocal<String> local = new ThreadLocal<>();
		local.set("Vikram");
		local.set("Raj");
		
		

	}

}
