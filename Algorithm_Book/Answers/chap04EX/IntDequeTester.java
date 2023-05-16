// 演習4-7
// int型固定長デックのテストプログラム

import java.util.Scanner;

class IntDequeTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntDeque s = new IntDeque(64);				// 最大64個押し込めるキュー

		while (true) {
			System.out.printf("現在のデータ数：%d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)先頭にエンキュー　(2)先頭からデキュー　(3)先頭からピーク\n" +
											 "(4)末尾にエンキュー　(5)末尾からデキュー　(6)末尾からピーク\n" +
											 "(7)ダンプ　(8)探索　(0)終了：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int x = 0, idx;

			switch (menu) {
			 case 1:												// 先頭にエンキュー
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.enqueFront(x);
				 } catch (IntDeque.OverflowIntDequeException e) {
					System.out.println("キューが満杯です。");
				}
				break;

			 case 2:												// 先頭からデキュー
				try {
					 x = s.dequeFront();
					System.out.println("デキューしたデータは" + x + "です。");
				 } catch (IntDeque.EmptyIntDequeException e) {
					System.out.println("キューが空です。");
				}
				break;

			 case 3:												// 先頭からピーク
				try {
					 x = s.peekFront();
					System.out.println("ピークしたデータは" + x + "です。");
				 } catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;

			 case 4:												// 先頭にエンキュー
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.enqueRear(x);
				 } catch (IntDeque.OverflowIntDequeException e) {
					System.out.println("キューが満杯です。");
				}
				break;

			 case 5:												// 先頭からデキュー
				try {
					 x = s.dequeRear();
					System.out.println("デキューしたデータは" + x + "です。");
				 } catch (IntDeque.EmptyIntDequeException e) {
					System.out.println("キューが空です。");
				}
				break;

			 case 6:												// 先頭からピーク
				try {
					 x = s.peekRear();
					System.out.println("ピークしたデータは" + x + "です。");
				 } catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;

			 case 7:												// ダンプ
				s.dump();
				break;

			 case 8:												// 探索
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

