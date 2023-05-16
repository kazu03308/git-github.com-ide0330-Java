// 演習5-5(1)
// 再帰に対する理解を深めるための真に再帰的なメソッド（呼び出し回数をカウント）

import java.util.Scanner;

class RecurCount {

	static int count;

	//--- 真に再帰的なメソッド ---//
	static void recur(int n) {
		count++;
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();

		recur(x);

		System.out.println("メソッド呼び出し回数：" + count);		
	}
}
