// 演習5-7
// ハノイの塔（軸名を文字列で表示）

import java.util.Scanner;

class HanoiEx {

	static String[] name = {"Ａ軸", "Ｂ軸", "Ｃ軸"};

	//--- 円盤をx軸からy軸へ移動 ---//
	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);

		System.out.println("円盤[" + no + "]を" + name[x - 1] + "から" + name[y - 1] + "へ移動");

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("ハノイの塔");
		System.out.print("円盤の枚数：");
		int n = stdIn.nextInt();

		move(n, 1, 3);   // 第1軸に積まれたn枚を第3軸に移動
	}
}

