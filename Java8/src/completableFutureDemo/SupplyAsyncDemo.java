package completableFutureDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class SupplyAsyncDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Supplier<String> supplier = () -> {
			System.out.println("In Thread Body...");
			return "Hello World";
			
		};
		
		System.out.println("In Main, starting new thread....");
		CompletableFuture<String> cFuture = CompletableFuture.supplyAsync(supplier);
		System.out.println("Main doing something else ...");
		
		System.out.println("Main waiting for thread result...");
		String result = cFuture.get();
		System.out.println("Result from thread:"+result);
		
		System.out.println("Main completed");

	}

}
