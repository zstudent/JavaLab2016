package lesson160406;

public class DUplicate {
	
	static class A {
		
		final void m() {
			a1();
			a2();
			a3();
			a4();
			a5();
			a6();
			// a
			// a
			// a
			// a  *
			// a
		}
	}
	
	static class B extends A {

		void a2() {
			
		}
		
		void a5() {
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
