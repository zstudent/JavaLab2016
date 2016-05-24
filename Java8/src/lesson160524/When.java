package lesson160524;

import java.util.concurrent.CompletableFuture;

import util.Utils;

public class When {

	public static void main(String[] args) {

		CompletableFuture.supplyAsync(() -> {
			System.out.println("start");
			x();
			return 12;
		}).handle((i, t) -> {
			if (t != null) {
				System.out.println(t.getMessage());
				return 0;
			}
			System.out.println(i);
			return i;
		}).join();

	}

	private static void x() {
		Utils.delay(1000);
		throw new RuntimeException("hehe");
	}

}
