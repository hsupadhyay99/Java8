package completableFutureDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class ThenCombineDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Supplier<Integer> supplier1 = () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1 returning 21...");
			return 21;
		};

		Supplier<Integer> supplier2 = () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 2 returning 45...");
			return 45;
		};
		
		CompletableFuture<Integer> cFuture1 = CompletableFuture.supplyAsync(supplier1);
		CompletableFuture<Integer> cFuture2 = CompletableFuture.supplyAsync(supplier2);
		
		System.out.println("Calculating the average of the values returned by both threads...");
		CompletableFuture<Integer> combinedFuture = cFuture2.thenCombine(cFuture1, (value1,value2) -> (value1+value2)/2);
		int average = combinedFuture.get();
		System.out.println("Average is "+average);
	}

}
