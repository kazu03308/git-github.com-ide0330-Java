// 記号文字+と-を交互に表示（その２[改]）

import java.util.Scanner;

class Alternative2a {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("記号文字+と-を交互にn個表示します。");

		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n / 2; i++)
			System.out.print("+-");

		if (n % 2 != 0)
			System.out.print("+");
	}
}
