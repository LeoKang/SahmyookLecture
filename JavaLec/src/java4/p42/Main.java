package java4.p42;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		// 42 page
		String text = "홍길동&이수홍,박연수,김자바-Simon";

		String[] names = text.split("&|,|-");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("---------------------");

		// 43 page
		String text2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text2, "/");
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		st = new StringTokenizer(text2, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
