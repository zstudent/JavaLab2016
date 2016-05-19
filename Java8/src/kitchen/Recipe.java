package kitchen;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import util.Utils;

public class Recipe {
	
	static Random random = new Random();
	static SupplyStrategy strategy = new SequentialStrategy();
	
	public static String cook(String dish, Supplier<?>... ingredients) {
		String action = ingredients.length == 0? "getting " : "cooking ";
		System.out.println(action + dish + " in " + Thread.currentThread().getName());
		CompletableFuture<?> use = strategy.use(ingredients);
		use.thenRun(() -> {
			Utils.delay(1000 + random.nextInt(3000));
			System.out.println(dish + " is ready");
		}).join();
		return dish;
	}


}
