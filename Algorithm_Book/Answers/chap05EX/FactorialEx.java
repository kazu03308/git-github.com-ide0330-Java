// 演習5-1
// 階乗値を非再帰的に求める

import java.util.Scanner;

class FactorialEx {

	//--- 非負の整数値nの階乗値を返却 ---//
	static int factorial(int n) {
		int fact = 1;

		while (n > 1)
			fact *= n--;
		return fact;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int   x = stdIn.nextInt();

		System.out.println(x + "の階乗は" + factorial(x) + "です。");
	}
}

