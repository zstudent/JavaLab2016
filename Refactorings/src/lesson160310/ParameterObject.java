package lesson160310;

public class ParameterObject {
	
	private void m1() {

		int x = 10;
		int y = 20;
		
		int z = 30;
		
		int s = m2(new M2Parameter(x, y, z));
		
		System.out.println(s);

	}

	private int m2(M2Parameter parameterObject) {
		int s = m3(parameterObject);
		return s;
	}

	private int m3(M2Parameter parameterObject) {
		int s = m4(parameterObject);
		return s;
	}

	private int m4(M2Parameter parameterObject) {
		int s = parameterObject.x + parameterObject.y + parameterObject.z;
		return s;
	}

}
