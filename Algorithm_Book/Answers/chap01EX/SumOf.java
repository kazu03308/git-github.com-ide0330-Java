// 演習1-8
// 整数a, bを含めその間の全整数の総和を求める

import java.util.Scanner;

class SumOf {

	static int sumof(int a, int b) {
		int min;		// a, bの小さいほうの値
		int max;		// a, bの大きいほうの値

		if (a < b) {
			min = a;  max = b;
		} else {
			min = b;  max = a;
		}

		int sum = 0;		// 和
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("aとbを含めてその間の全整数の総和を求めます。");
		System.out.print("aの値：");  int a = stdIn.nextInt();
		System.out.print("bの値：");  int b = stdIn.nextInt();

		System.out.println("整数a,b間の全整数の総和は" + sumof(a, b) + "です。");
	}
}
