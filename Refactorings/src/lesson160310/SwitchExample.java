package lesson160310;

public class SwitchExample {

	public static final int ADD = 0;
	public static final int SUB = 1;
	public static final int MUL = 2;

	static class A {

		void process(int commandID) {
			switch (commandID) {
			case ADD:
				// do something
				break;

			case SUB:
				// do something

				break;

			case MUL:
				// do something

				break;

			default:
				System.out.println("unknown comamnd " + commandID);
				break;
			}
		}

	}

}
