// 演習4-2
// ジェネリックなスタックの利用例（Gstackクラスの全メソッドを利用）

import java.util.Scanner;

class StackTesterEx {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Stack<String> s = new Stack<String>(64);	// 最大64個プッシュできるスタック

		while (true) {
			System.out.printf("現在のデータ数：%d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)プッシュ (2)ポップ (3)ピーク " +
											 "(4)ダンプ (5)探索 (6)空にする " +
											 "(7)情報表示 (0)終了：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			String x;

			switch (menu) {
			 case 1: 								// プッシュ
				System.out.print("データ：");
				x = stdIn.next();
				try {
					s.push(x);
				 } catch (Stack.OverflowGstackException e) {
					System.out.println("スタックが満杯です。");
				}
				break;

			 case 2: 								// ポップ
				try {
					 x = s.pop();
					System.out.println("ポップしたデータは" + x + "です。");
				 } catch (Stack.EmptyGstackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			 case 3: 								// ピーク
				try {
					 x = s.peek();
					System.out.println("ピークしたデータは" + x + "です。");
				 } catch (Stack.EmptyGstackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			 case 4:								// ダンプ
				s.dump();
				break;

			 case 5:								// 探索
				System.out.print("探索するデータ：");
				x = stdIn.next();
				int n = s.indexOf(x);
				if (n >= 0)
					System.out.println("頂上から" + (s.size() - n) +"番目に存在します。");
				else
					System.out.println("そのデータはありません。");
				break;

			 case 6:								// 空にする
				s.clear();
				break;

			 case 7:								// 情報表示
				System.out.println("容量：" + s.getCapacity());
				System.out.println("データ数：" + s.size());
				System.out.println("空" + (s.isEmpty()	? "です。"
																								: "ではありません。"));
				System.out.println("満杯" + (s.isFull() ? "です。"
																								: "ではありません。"));
				break;
			}
		}
	}
}

