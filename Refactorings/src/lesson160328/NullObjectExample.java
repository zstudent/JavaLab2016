package lesson160328;

public class NullObjectExample {
	
	final static PrintingDevice nullPrinter = new PrintingDevice() {
		
		@Override
		public void print(String message) {
			// ignore
		}
	}; 

	static class Printer implements PrintingDevice {
		
		@Override
		public void print(String message) {
			System.out.println(message);
		}
		
		public void methodA() {
			
		}
		
		public void methodB() {
			
		}
		
		public void methodC() {
			
		}
		
	}
	
	PrintingDevice printer = nullPrinter;
	
	public static void main(String[] args) {
		
		NullObjectExample example = new NullObjectExample();
		
		example.log("hello");
		
	}

	private void log(String logMessage) {
		printer.print(logMessage);
	}
	
	
}
