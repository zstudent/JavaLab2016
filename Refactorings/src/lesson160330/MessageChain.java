package lesson160330;

public class MessageChain {

	public static class Context {

	}

	static class A {
		
	}
	
	static class B {
		A a = new A();
	}
	
	static class C {
		B b = new B();
	}
	
	static class D {
		C c = new C();
		A a = new A();
	}
	
	public static void main(String[] args) {
		
		Context x;
		
		D d = new D();
		
		A a1 = d.c.b.a;
		
		
	}
	
}
