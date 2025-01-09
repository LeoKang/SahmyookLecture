package java5.p33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long timeStart, timeEnd;

		timeStart = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(i, String.valueOf(i));
		}
		timeEnd = System.nanoTime();
		System.out.print("ArrayList  걸린 시간 : ");
		System.out.printf("%10d ns\n", timeEnd - timeStart);

		timeStart = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(i, String.valueOf(i));
		}
		timeEnd = System.nanoTime();
		System.out.print("LinkedList 걸린 시간 : ");
		System.out.printf("%10d ns\n", timeEnd - timeStart);
	}

}
