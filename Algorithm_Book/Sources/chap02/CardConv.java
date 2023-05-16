// 読み込んだ10進整数を2進数～36進数へと基数変換して表示

import java.util.Scanner;

class CardConv {

	//--- 整数値xをr進数に変換した数字文字の並びを配列dに格納して桁数を返却 ---//
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;						// 変換後の桁数
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);	// rで割った剰余を格納
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) {	// 配列dの並びを反転
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}

		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;											// 変換する整数
		int cd;											// 基数
		int dno;										// 変換後の桁数
		int retry;									// もう一度？
		char[] cno = new char[32];	// 変換後の各桁を格納する文字の配列

		System.out.println("10進数を基数変換します。");
		do {
			do {
				System.out.print("変換する非負の整数：");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.print("何進数に変換しますか（2-36）：");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConv(no, cd, cno);			// noをcd進数に変換

			System.out.print(cd + "進数では");
			for (int i = 0; i < dno; i++)			// 順に表示
				System.out.print(cno[i]);
			System.out.println("です。");

			System.out.print("もう一度しますか（1…はい／0…いいえ）：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
