// 読み込んだ整数値の判定（その１）

import java.util.Scanner;

class JudgeABC1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		int n = stdIn.nextInt();

		if (n == 1)
			System.out.println("Ａ");
		else if (n == 2)
			System.out.println("Ｂ");
		else
			System.out.println("Ｃ");
	}
}
