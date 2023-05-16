// n個の記号文字*をw個ごとに改行しながら表示（その１）

import java.util.Scanner;

class PrintStars1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, w;

		System.out.println("記号文字*をw個ごとに改行しながらn個表示します。");

		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		do {
			System.out.print("wの値：");
			w = stdIn.nextInt();
		} while (w <= 0 || w > n);

		for (int i = 0; i < n; i++) {
			System.out.print("*");
			if (i % w == w - 1)
				System.out.println();	// 改行
		}
		if (n % w != 0) 
			System.out.println();		// 改行
	}
}
