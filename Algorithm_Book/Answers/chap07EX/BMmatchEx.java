// 演習7-4
// Boyer-Moore法による文字列探索（照合過程の詳細を表示）

import java.util.Scanner;

class BMmatchEx {

	//--- Boyer-Moore法による文字列探索 ---//
	static int bmMatch(String txt, String pat) {
		int pt;								// txtをなぞるカーソル
		int pp;								// patをなぞるカーソル
		int txtLen = txt.length();		// txtの文字数
		int patLen = pat.length();		// patの文字数
		int[] skip = new int[Character.MAX_VALUE + 1];	// スキップテーブル
		int count = 0;   // 比較回数
		int k = -1;

		// スキップテーブルの作成
		for (pt = 0; pt <= Character.MAX_VALUE; pt++)
			skip[pt] = patLen;
		for (pt = 0; pt < patLen - 1; pt++)
			skip[pat.charAt(pt)] = patLen - pt - 1;
																// pt == patLen - 1である
		// 探索
		while (pt < txtLen) {
			pp = patLen - 1;               // patの最後の文字に着目

			if (k == pt - pp)
				System.out.print("    ");
			else {
				System.out.printf("%2d  ", pt - pp);
				k = pt - pp;
			} 
			for (int i = 0; i < txt.length(); i++)
				System.out.print(txt.charAt(i) + " ");
			System.out.println();

			for (int i = 0; i < pt * 2 + 4; i++)
				System.out.print(" ");
			System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
			System.out.println();

			for (int i = 0; i < (pt-pp) * 2 + 4; i++)
				System.out.print(" ");

			for (int i = 0; i < pat.length(); i++)
				System.out.print(pat.charAt(i) + " ");
			System.out.println();
			System.out.println();
			count++;

			while (txt.charAt(pt) == pat.charAt(pp)) {

				if (pp == 0)
					return pt;         // 探索成功
				pp--;
				pt--;
				if (k == pt - pp)
					System.out.print("    ");
				else {
					System.out.printf("%2d  ", pt - pp);
					k = pt - pp;
				} 
				for (int i = 0; i < txt.length(); i++)
					System.out.print(txt.charAt(i) + " ");
				System.out.println();

				for (int i = 0; i < pt * 2 + 4; i++)
					System.out.print(" ");
				System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
				System.out.println();

				for (int i = 0; i < (pt-pp) * 2 + 4; i++)
					System.out.print(" ");

				for (int i = 0; i < pat.length(); i++)
					System.out.print(pat.charAt(i) + " ");
				System.out.println();
				System.out.println();
				count++;
			}
			pt += skip[txt.charAt(pt)];
		}
		return -1;									// 探索失敗
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("テキスト：");
		String s1 = stdIn.next(); 					// テキスト用文字列

		System.out.print("パターン：");
		String s2 = stdIn.next();						// パターン用文字列

		int idx = bmMatch(s1, s2);	// 文字列s1から文字列s2をBM法で探索

		if (idx == -1)
			System.out.println("テキスト中にパターンは存在しません。");
		else {
			// マッチ文字の直前までの《半角》での文字数を求める
			int len = 0;
			for (int i = 0; i < idx; i++)
				len += s1.substring(i, i + 1).getBytes().length;
			len += s2.length();

			System.out.println((idx + 1) + "文字目にマッチします。");
			System.out.println("テキスト：" + s1);
			System.out.printf(String.format("パターン：%%%ds\n", len), s2);
		}
	}
}

