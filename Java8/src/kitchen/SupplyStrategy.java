package kitchen;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public interface SupplyStrategy {

	CompletableFuture<?> use(Supplier<?>... ingredient);

}
