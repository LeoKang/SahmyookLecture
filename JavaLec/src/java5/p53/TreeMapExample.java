package java5.p53;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");

		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.lowerEntry(95);
		System.out.println("95점 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.higherEntry(95);
		System.out.println("95점 위의 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.floorEntry(95);
		System.out.println("95점 이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.ceilingEntry(85);
		System.out.println("85점 이거나 바로 위의 점수 : " + entry.getKey() + "-" + entry.getValue());

		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수 : " + scores.size() + ")");
		}
	}
}
