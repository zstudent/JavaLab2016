package lesson160315;

import java.util.Arrays;
import java.util.Comparator;

public class Example02 {

	public static void main(String[] args) {

		String[] a = { "one", "two", "three", "four" };

		Arrays.sort(a, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		Arrays.sort(a, (s1, s2) -> s1.length() - s2.length());

	}
}
