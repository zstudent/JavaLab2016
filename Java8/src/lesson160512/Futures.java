package lesson160512;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Futures {

	static class Task implements Callable<String> {

		@Override
		public String call()  {
			for (int i = 0; i < 4; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.err.println("doing task " + i);
			}
			return "hello";
		}

	}

	public static void main(String[] args) {

//		ExecutorService service = Executors.newFixedThreadPool(2);
//
//		Future<String> future = service.submit(new Task());
//
//		// do something other
//
//		System.out.println("do something...");
//
//		try {
//			System.out.println("getting result");
//			String result = future.get();
//			System.out.println(result);
//		} catch (InterruptedException | ExecutionException e) {
//			e.printStackTrace();
//		}
//		
		
		ExecutorService service = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		
		CompletableFuture.supplyAsync(new Task()::call, service).thenAccept(System.out::println);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
