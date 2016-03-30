package lesson160310;

public class SwitchExampleRefactored {

	static abstract class Command {

		abstract public void execute(A a);
		
	}
	
	static class Add extends Command {
		@Override
		public void execute(A a) {
		}
		
	}
	
	static class Sub extends Command {
		@Override
		public void execute(A a) {
		}
	}
	
	static class Mul extends Command {
		@Override
		public void execute(A a) {
		}
		
	}
	
	static class A {

		void process(Command command) {
			command.execute(this);
		}

	}

}
