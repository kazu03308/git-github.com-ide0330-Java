// 真に再帰的なメソッドrecurをメモ化して実現

import java.util.Scanner;

class RecurMemo {

	static String[] memo;

	//--- メモ化を導入したメソッドrecur ---//
	static void recur(int n) {
		if (memo[n + 1] != null)
			System.out.print(memo[n + 1]);								// メモを出力
		else {
			if (n > 0) {
				recur(n - 1);
				System.out.println(n);
				recur(n - 2);
				memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];		// メモ化
			} else {
				memo[n + 1] = "";	 // メモ化：recur(0)とrecur(-1)は空文字列
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();

		memo = new String[x + 2];
		recur(x);
	}
}
