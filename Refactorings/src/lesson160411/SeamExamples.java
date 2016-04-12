package lesson160411;

import lesson160411.other.Table;


public class SeamExamples {
	
	static class Cleaner {
		
		Furn table = new Table();
		
		void clean() {
			table.move();
			table.clean();
		}
		
	}
	

}
