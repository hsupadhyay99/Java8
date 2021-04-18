package completableFutureDemo;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ChainingCallbacksDemo {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello";
		
		CompletableFuture.supplyAsync(supplier).thenApply(str -> str.toUpperCase()).thenAccept(str -> System.out.println(str));

	}

}
