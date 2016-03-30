package lesson160310;

public class EnvyFunctions {
	
	class A {
		
		public  void m1() {
			// TODO Auto-generated method stub

		}
		
		public void m2() {
			// TODO Auto-generated method stub

		}
		
		public void m3() {
			// TODO Auto-generated method stub

		}

		void someActions() {
			m1();
			m2();
			m3();
		}
		
	}
	
	class B {
		
		public void doSomething (A a) {
			
			a.someActions();
			
		}
		
		
	}
	

}
