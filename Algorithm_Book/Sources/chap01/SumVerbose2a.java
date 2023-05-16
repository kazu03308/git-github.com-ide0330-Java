// 1, 2, …, nの総和を求める（求める過程の式を表示：その２[改]）

import java.util.Scanner;

class SumVerbose2a {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("1からnまでの総和を求めます。");

		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;		// 総和

		for (int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;		// sumにiを加える
		}

		System.out.println(n + " = " + (sum += n));
	}
}
