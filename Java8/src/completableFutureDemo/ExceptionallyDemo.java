package completableFutureDemo;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExceptionallyDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Integer> cfuture = CompletableFuture.supplyAsync(()-> {
			int num = new Random(100).nextInt();
			if(num < 100) {
				throw new RuntimeException("Incorrect Number");
			}
			else {
				return num;
			}
		}).exceptionally(ex -> {
			System.out.println("Incorrect Number:"+ex.getMessage());
			return 0;
		});
		
		int result = cfuture.get();
		System.out.println("Result:"+result);

	}

}
