package java5.p51;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("c");
		treeSet.add("f");
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("[c-f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", false, "forever", true);
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}
}
