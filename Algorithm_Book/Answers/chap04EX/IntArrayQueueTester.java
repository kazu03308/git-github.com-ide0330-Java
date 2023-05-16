// 演習4-4
// int型固定長キュー（リングバッファを用いない実現）の利用例

import java.util.Scanner;

class IntArrayQueueTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntArrayQueue s = new IntArrayQueue(64);		// 最大64個プッシュできるキュー

		while (true) {
			System.out.println("現在のデータ数：" + s.size() + " / "
																						+ s.capacity());
			System.out.print("(1)エンキュー　(2)デキュー　(3)ピーク　" +
											 "(4)ダンプ　(0)終了：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int x = 0;
			switch (menu) {
			 case 1:													// エンキュー
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.enque(x);
				 } catch (IntArrayQueue.OverflowIntArrayQueueException e) {
					System.out.println("キューが満杯です。");
				}
				break;

			 case 2:													// デキュー
				try {
					 x = s.deque();
					System.out.println("デキューしたデータは" + x + "です。");
				 } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("キューが空です。");
				}
				break;

			 case 3:													// ピーク
				try {
					 x = s.peek();
					System.out.println("ピークしたデータは" + x + "です。");
				 } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("キューが空です。");
				}
				break;

			 case 4:													// ダンプ
				s.dump();
				break;
			}
		}
	}
}

