package completableFutureDemo;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ThenAcceptDemo {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			System.out.println("In Thread Body...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Hello";
		};
		
		System.out.println("In main.....");
		CompletableFuture.supplyAsync(supplier).thenAccept(str -> System.out.println(str+" World!!"));
		System.out.println("Main doing something else....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting main...");

	}

}
