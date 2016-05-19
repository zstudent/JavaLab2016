package kitchen;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

final class SequentialStrategy implements
		SupplyStrategy {
	@Override
	public CompletableFuture<?> use(Supplier<?>... ingredients) {
		for (Supplier<?> ingredient : ingredients) {
			ingredient.get();
		}
		return CompletableFuture.completedFuture("");
	}
}