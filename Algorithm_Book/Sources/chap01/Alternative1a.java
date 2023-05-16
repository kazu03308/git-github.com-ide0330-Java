// 記号文字+と-を交互に表示（その１[改]）

import java.util.Scanner;

class Alternative1a {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("記号文字+と-を交互にn個表示します。");

		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++)
			if (i % 2 == 0)					// 奇数
				System.out.print("-");
			else										// 偶数
				System.out.print("+");
	}
}
