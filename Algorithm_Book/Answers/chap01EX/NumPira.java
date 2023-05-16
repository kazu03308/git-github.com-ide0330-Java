// 演習1-16
// 数字を並べてピラミッドを表示

import java.util.Scanner;

class NumPira {

	//--- 数字を並べてピラミッドを表示 ---//
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {					// i行（i = 1, 2, … ,n）
			for (int j = 1; j <= n - i; j++)			// n-i個の' 'を表示
				System.out.print(' ');
			for (int j = 1; j <= (i-1)*2+1; j++)	// (i-1)*2+1個の'*'を表示
				System.out.print(i % 10);
			System.out.println();									// 改行
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("ピラミッドを表示します。");

		do {
			System.out.print("段数は：");
			n = stdIn.nextInt();
		} while (n <= 0);

		npira(n);					// ピラミッドを表示
	}
}