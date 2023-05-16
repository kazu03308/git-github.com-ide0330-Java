// 階乗値を再帰的に求める（条件演算子を利用）

import java.util.Scanner;

class Factorial2 {

	//--- 非負の整数値nの階乗値を返却 ---//
	static int factorial(int n) {
		return (n > 0) ? n * factorial(n - 1) : 1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();

		System.out.println(x + "の階乗は" + factorial(x) + "です。");
	}
}
