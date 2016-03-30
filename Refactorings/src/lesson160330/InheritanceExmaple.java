package lesson160330;

public class InheritanceExmaple {
	
	public interface Doable {
		
		void doIt();

	}


	static class A implements Doable {
		
		@Override
		public void doIt() {
			System.out.println("A");
		}
		
	}
	
	
	static class B extends A {
		
	}
	
	static class C implements Doable {
		
		private Doable d;

		public void setD(Doable d) {
			this.d = d;
		}

		@Override
		public void doIt() {
			d.doIt();
		}
		
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.doIt();
		
		C c = new C();
		c.setD(new Doable() {

			@Override
			public void doIt() {
				System.out.println("hoho");
			}
			
		});
		
		c.doIt();
		
		c.setD(new B());
		
		c.doIt();
	}

}
