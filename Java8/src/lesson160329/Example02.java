package lesson160329;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example02 {
	
	static class A {
		
		A() {}
		
		A(int x) {
			
		}
		
		A(int x, int y) {
			
		}
	}
	
	interface MySup<T> {
		T createMyIncredibleObject();
	}
	
	
	public static void main(String[] args) {
		
		Supplier<A> s = A::new;
		
		MySup<A> ms = A::new;
		
		A a = ms.createMyIncredibleObject();
		
		System.out.println(a);
		
		Function<Integer, A> f =  A::new;
		
		A a2 = f.apply(10);
		
		Function<Integer, A> f2 =  A::new;
		
	}
		
}
