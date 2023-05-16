// n個の記号文字*をw個ごとに改行しながら表示（その２）

import java.util.Scanner;

class PrintStars2 {

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

		for (int i = 0; i < n / w; i++)
			System.out.println("*".repeat(w));

		int rest = n % w;
		if (rest != 0) 
			System.out.println("*".repeat(rest));
	}
}