// 演習1-7
// ガウスの公式によって1, 2, …, nの総和を求める

import java.util.Scanner;

class SumGauss {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの総和を求めます。");
		System.out.print("nの値：");
		int n = stdIn.nextInt();

		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);   // 和

		System.out.println("1から" + n + "までの総和は" + sum + "です。");
	}
}
