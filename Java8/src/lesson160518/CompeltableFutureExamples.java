package lesson160518;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import util.Utils;

public class CompeltableFutureExamples {
	
	static class DataProvider {
		
		double getData() {
			Utils.delay(30000);
			return Math.random();
		}
		
		public Future<Double> getDataAsync() {
			CompletableFuture<Double> futureData = new CompletableFuture<>();
			// effectively final
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					double result = getData();
					futureData.complete(result);
				}
			}).start();
			return futureData;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		DataProvider data = new DataProvider();
//		
		System.out.println("getting data");
//		
//		try {
//			Double d = data.getDataAsync().get();
//			
//			System.out.println(d);
//		} catch (InterruptedException | ExecutionException e) {
//			e.printStackTrace();
//		}
		
		CompletableFuture.supplyAsync(data::getData).thenAccept(System.out::println);
		
		
	}

}
