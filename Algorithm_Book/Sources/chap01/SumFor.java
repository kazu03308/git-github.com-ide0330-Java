// 1, 2, …, nの総和を求める（for文）

import java.util.Scanner;

class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの総和を求めます。");
		System.out.print("nの値：");
		int n = stdIn.nextInt();

		int sum = 0;				// 総和

		for (int i = 1; i <= n; i++)
			sum += i;					// sumにiを加える

		System.out.println("1から" + n + "までの総和は" + sum + "です。");
	}
}
