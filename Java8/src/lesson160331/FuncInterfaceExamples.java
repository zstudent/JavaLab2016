package lesson160331;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FuncInterfaceExamples {
	
//	@FunctionalInterface
//	interface Nothing {
//		
//	}

	@FunctionalInterface
	interface A {
		void m();
	}
	
//	@FunctionalInterface
//	interface B extends A {
//		void m2();
//	}
	
	
	public static void main(String[] args) throws Exception {
		
		Callable<Integer> c = () -> 42;
		System.out.println(c.call());
		
		PrivilegedAction<Integer> p = () -> 42;
		
		launch(c);
		launch(p::run);
		launch(() -> 42);
		
//		Object o = () -> 42;
		
		List<String> list = new ArrayList<>();
		
		Predicate<String> p2 = (s) -> list.add(s);
		Predicate<String> p3 = list::add;
		
		Consumer<String> c0 = list::add;
		
		
	}
	
	static void launch(Callable<?> c) {
		try {
			System.out.println(c.call());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
