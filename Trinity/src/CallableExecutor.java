import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class CallableExecutor {
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		List<Future<String>> futureList = new LinkedList<>();
		for(int i=0;i< 5;i++){
			
		}
		
		CompletableFuture.supplyAsync(new Supplier<String>() {

			public String get() {
				return null;
			}
			
		});
		
		CompletableFuture.supplyAsync(
				() -> {
					
					
					return 20;
				}
				);
		
	}
	

}

class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Vikram";
	}
	
}
