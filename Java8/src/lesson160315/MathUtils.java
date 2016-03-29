package lesson160315;

public class MathUtils {

	public interface Integrable {
		double eval(double x);
	}
	
	public interface Calculable {
		double calc(double y);
	}

	private static double integrate(Integrable function, double x1, double x2,
			int numSlices) {

		if (numSlices < 1) {
			numSlices = 1;
		}

		double delta = (x2 - x1) / numSlices;
		double start = x1 + delta / 2;
		double sum = 0;

		for (int i = 0; i < numSlices; i++) {
			sum += delta * function.eval(start + delta * i);
		}

		return sum;
	}
	
	public static void test(Integrable function, double x1, double x2) {
		for (int i = 0; i < 7; i++) {
			int num = (int) Math.pow(10,  i);
			double result = integrate(function, x1, x2, num);
			System.out.println(num + "   " + result);
		}
	}
	
	public static void main(String[] args) {
		
		Calculable calculable = new Calculable() {
			@Override
			public double calc(double y) {
				return y / 2;
			}
		};
		
		Calculable calc2 = y -> y/2;
		
		test(x -> x*x, 10, 100);
		
//		test(calculable, 0, 20);
//		test(calc2, 0, 20);
		test(y -> y/2, 0, 20);
		
		test(calculable::calc, 0, 20);
		
		test(calc2::calc, 0, 20);
		
		test((y) -> calc2.calc(y), 0, 20);
		
		
		
	}

}
