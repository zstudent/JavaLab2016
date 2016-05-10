package lesson160510;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class FJ0 {
	
	static class Task extends RecursiveAction {
		
		private int level;

		public Task(int level) {
			this.level = level;
		}

		@Override
		protected void compute() {
			
			System.out.println(this + " " + level);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (level == 0) {
				//  real data processing
				return;
			}
			
			Task subTask1 = new Task(level-1);
			Task subTask2 = new Task(level-1);
			
			invokeAll(Arrays.asList(subTask1, subTask2));
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ForkJoinPool pool = new ForkJoinPool(200);
		
		
		pool.invoke(new Task(5));
		
	}

}
