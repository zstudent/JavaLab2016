package lesson160328;

public class TempFieldExample {
	
	static class A {
		int x;
		int y;
		int z;
		public A(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		void methodA() {
			x += y;
		}
		
		void methodB() {
			y += x;
		}
		
		void methodC() {
			z = 10;
		}
		
	}

}
