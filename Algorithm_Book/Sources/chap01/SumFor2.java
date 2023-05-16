// 1, 2, …, nの総和を求める（do文によって正の整数値のみをnに読み込む）

import java.util.Scanner;

class SumFor2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("1からnまでの総和を求めます。");

		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;		// 総和

		for (int i = 1; i <= n; i++)
			sum += i;			// sumにiを加える

		System.out.println("1から" + n + "までの総和は" + sum + "です。");
	}
}
