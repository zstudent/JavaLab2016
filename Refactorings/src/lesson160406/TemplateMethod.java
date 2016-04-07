package lesson160406;

public class TemplateMethod {
	
	
	static abstract class A {
		
		final public void method() {
			a();
			b();
			b2();
			c();
			d();
			
		}
		
		abstract protected void b2();

		private void d() {
			// sdfsdfsd
			///s sdfsdfsdf
		}

		protected void c() {
			// sdfsdfsd
			///s sdfsdfsdf
		}

		private void b() {
			// sdfsdfsd
			///s sdfsdfsdf
		}

		private void a() {
			// sdfsdfsd
			///s sdfsdfsdf
		}
		
	}
	
	static class B {
		
		
		
	}
	

}
