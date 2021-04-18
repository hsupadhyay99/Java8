package completableFutureDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class ManualCompletionDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Supplier<String> supplier = () ->{
			System.out.println("In Thread body, doing something for a long time...");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "hello";
		};
		
		System.out.println("In main, starting new thread");
		CompletableFuture<String> cFuture = CompletableFuture.supplyAsync(supplier);
		System.out.println("Main doing something else");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!cFuture.isDone()) {
			System.out.println("Thread is not complete, so completing manually");
			cFuture.complete("hello2");
		}
		
		String result = cFuture.get();
		System.out.println("Result is:"+result);
		System.out.println("Main completed");
	}

}
