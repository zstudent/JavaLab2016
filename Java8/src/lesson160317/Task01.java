package lesson160317;

import java.util.Arrays;
import java.util.Comparator;

public class Task01 {

	public static void main(String[] args) {
		String[] a = { "one", "two", "three", "four" };

		// Arrays.sort(a, new Comparator<String>() {
		// @Override
		// public int compare(String s1, String s2) {
		// return s1.length() - s2.length();
		// }
		// });

		Arrays.sort(a, (s1, s2) -> s1.length() - s2.length());
		Arrays.sort(a, (s1, s2) -> {
			return s1.length() - s2.length();
		});

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("hello");
			}

		}).start();

		new Thread(() -> System.out.println("hello")).start();

		System.out.println(Arrays.toString(a));

		// 1. sort by length, descendant

		// 2. sort alphabetically by second letter

		// 3. sort by second letter only words started from 't'

	}

}
