package kitchen;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

final class AsyncStrategy implements
		SupplyStrategy {
	@Override
	public CompletableFuture<?> use(Supplier<?>... ingredients) {
		List<CompletableFuture<?>> list = new LinkedList<>();
		for (Supplier<?> ingredient : ingredients) {
			CompletableFuture<?> future = CompletableFuture.supplyAsync(ingredient);
			list.add(future);
		}
		return CompletableFuture.allOf(list.toArray(new CompletableFuture<?>[0]));
	}
}