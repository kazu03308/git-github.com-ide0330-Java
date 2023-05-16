// 演習4-6
// 汎用キューのテストプログラム

import java.util.Scanner;

class QueueTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Queue<String> s = new Queue<String>(64);			// 最大64個押し込めるキュー

		while (true) {
			System.out.printf("現在のデータ数：%d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)エンキュー　(2)デキュー　(3)ピーク　" +
											 "(4)ダンプ　(5)探索 (0)終了：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int idx;
			String x;

			switch (menu) {
			 case 1:														// エンキュー
				System.out.print("データ：");
				x = stdIn.next();
				try {
					s.enque(x);
				 } catch (Queue.OverflowGqueueException e) {
					System.out.println("キューが満杯です。");
				}
				break;

			 case 2:														// デキュー
				try {
					 x = s.deque();
					System.out.println("デキューしたデータは" + x + "です。");
				 } catch (Queue.EmptyGqueueException e) {
					System.out.println("キューが空です。");
				}
				break;

			 case 3:														// ピーク
				try {
					 x = s.peek();
					System.out.println("ピークしたデータは" + x + "です。");
				 } catch (Queue.EmptyGqueueException e) {
					System.out.println("キューが空です。");
				}
				break;

			 case 4:														// ダンプ
				s.dump();
				break;

			 case 5: { 								// 探索
				System.out.print("データ：");
				String str = stdIn.next();
				int n = s.search(str);
				if (n != 0)
					System.out.printf("%d番目のデータでインデックス%dの位置に格納されています。\n", n, s.indexOf(str));
				else
					System.out.println("そのデータは登録されていません。");
				break;
			 }
			}
		}
	}
}

