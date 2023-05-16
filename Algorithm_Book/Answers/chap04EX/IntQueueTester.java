// 演習4-5
// int型固定長キューのテストプログラム（メソッドindexOfとsearchの呼出しを追加）

import java.util.Scanner;

class IntQueueTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64);	// 最大64個エンキューできるキュー

		while (true) {
			System.out.printf("現在のデータ数：%d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)エンキュー　(2)デキュー　(3)ピーク　" +
											 "(4)ダンプ　(5)探索 (0)終了：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 								// エンキュー
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.enque(x);
			 	} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("キューが満杯です。");
				}
				break;

			 case 2: 								// デキュー
				try {
			 		x = s.deque();
					System.out.println("デキューしたデータは" + x + "です。");
			 	} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;

			 case 3: 								// ピーク
				try {
					x = s.peek();
					System.out.println("ピークしたデータは" + x + "です。");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;

			 case 4: 								// ダンプ
				s.dump();
				break;

			 case 5: { 								// 探索
				System.out.print("データ：");
				x = stdIn.nextInt();
				int n = s.search(x);
				if (n != 0)
					System.out.printf("%d番目のデータでインデックス%dの位置に格納されています。\n", n, s.indexOf(x));
				else
					System.out.println("そのデータは登録されていません。");
				break;
			 }
			}
		}
	}
}
