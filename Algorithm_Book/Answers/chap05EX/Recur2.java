// 演習5-4
// 再帰に対する理解を深めるための真に再帰的なメソッドrecur2の解析

/*
	トップダウン解析は省略します。

	ボトムアップ解析を行うと、次のようになります。
	recur2(-1) （何も出力しない）
	recur2(0)  （何も出力しない）
	recur2(1)   recur2(-1) 1 recur2(0)    1
	recur2(2)   recur2(0) 2 recur2(1)     21
	recur2(3)   recur2(1) 3 recur2(2)     1321
	recur2(4)   recur2(2) 4 recur2(3)     2141321
*/

import java.util.Scanner;

class Recur2 {

	//--- 真に再帰的なメソッド ---//
	static void recur(int n) {
		if (n > 0) {
			recur(n - 2);
			System.out.println(n);
			recur(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();

		recur(x);
	}
}
