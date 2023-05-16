// ハノイの塔

import java.util.Scanner;

class Hanoi {

	//--- no枚の円盤をx軸からy軸へ移動 ---//
	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);

		System.out.printf("円盤[%d]を%d軸から%d軸へ移動\n", no, x, y);

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("ハノイの塔");
		System.out.print("円盤の枚数：");
		int n = stdIn.nextInt();

		move(n, 1, 3);	// 第1軸に積まれたn枚を第3軸に移動
	}
}
