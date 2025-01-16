package algo.dice;

import java.util.Scanner;

public class Main {
	static int n, m;
	static int ar[];

	public static void dice(int p) {
		// 종료 조건
		if (p == n) {
			for (int i = 0; i < ar.length; i++) {
				System.out.print((ar[i] + 1) + " ");
			}
			System.out.println();
			return;
		}

		// 재귀
		for (int i = 0; i < m; i++) {
			ar[p] = i;
			dice(p + 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();

		System.out.println(n + " " + m);

		ar = new int[n];

		dice(0);
	}
}
