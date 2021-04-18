package completableFutureDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RunAsyncDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable runnable = () -> {
			System.out.println("In Thread Body...");
			
			try {
				System.out.println("Thread doing something");
				Thread.sleep(2000);
				System.out.println("Thread processing completed");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Exiting Thread");
		};
		
		System.out.println("In main, starting new Theead...");
		
		CompletableFuture<Void> cFuture = CompletableFuture.runAsync(runnable);
		System.out.println("Main doing something else");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main completed");

	}

}
