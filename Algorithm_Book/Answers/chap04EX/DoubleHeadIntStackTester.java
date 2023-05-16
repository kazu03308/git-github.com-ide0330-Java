// 演習4-3
// 両頭int型固定長スタックの利用例（DoubleHeadIntStackTesterクラスの全メソッドを利用）

import java.util.Scanner;

class DoubleHeadIntStackTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		DoubleHeadIntStack s = new DoubleHeadIntStack(64);	// 最大64個プッシュできる両頭スタック

		while (true) {
			System.out.println("現在のデータ数："+
												 "Ａ：" + s.size(DoubleHeadIntStack.AorB.StackA) + "／" + 
												 "Ｂ：" + s.size(DoubleHeadIntStack.AorB.StackB));
			System.out.print("(1)Ａにプッシュ (2)Ａからポップ (3)Ａからピーク " +
											 "(4)Ａをダンプ (5)Ａから探索 (6)Ａを空にする\n" +
											 "(7)Ｂにプッシュ (8)Ｂからポップ (9)Ｂからピーク " +
											 "(10)Ｂをダンプ (11)Ｂから探索 (12)Ｂを空にする\n" +
											 "(13)情報表示 (0)終了：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int n, x = 0;
			switch (menu) {
			 case 1:													// Ａにプッシュ
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.push(DoubleHeadIntStack.AorB.StackA, x);
				 } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("スタックが満杯です。");
				}
				break;

			 case 2:													// Ａからポップ
				try {
					 x = s.pop(DoubleHeadIntStack.AorB.StackA);
					System.out.println("ポップしたデータは" + x + "です。");
				 } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			 case 3:													// Ａからピーク
				try {
					 x = s.peek(DoubleHeadIntStack.AorB.StackA);
					System.out.println("ピークしたデータは" + x + "です。");
				 } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			 case 4:													// Ａをダンプ
				s.dump(DoubleHeadIntStack.AorB.StackA);
				break;

			 case 5:													// Ａから探索
				System.out.print("探索するデータ：");
				x = stdIn.nextInt();
				n = s.indexOf(DoubleHeadIntStack.AorB.StackA, x);
				if (n >= 0)
					System.out.println("頂上から" + (s.size(DoubleHeadIntStack.AorB.StackA) - n) +"番目に存在します。");
				else
					System.out.println("そのデータはありません。");
				break;

			 case 6:													// 空にする
				s.clear(DoubleHeadIntStack.AorB.StackA);
				break;

			 case 7:													// Ｂにプッシュ
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.push(DoubleHeadIntStack.AorB.StackB, x);
				 } catch (DoubleHeadIntStack.OverflowDoubleHeadIntStackException e) {
					System.out.println("スタックが満杯です。");
				}
				break;

			 case 8:													// Ｂからポップ
				try {
					 x = s.pop(DoubleHeadIntStack.AorB.StackB);
					System.out.println("ポップしたデータは" + x + "です。");
				 } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			 case 9:													// Ｂからピーク
				try {
					 x = s.peek(DoubleHeadIntStack.AorB.StackB);
					System.out.println("ピークしたデータは" + x + "です。");
				 } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			 case 10:													// Ｂをダンプ
				s.dump(DoubleHeadIntStack.AorB.StackB);
				break;

			 case 11:													// Ｂから探索
				System.out.print("探索するデータ：");
				x = stdIn.nextInt();
				n = s.indexOf(DoubleHeadIntStack.AorB.StackB, x);
				if (n >= 0)
					System.out.println("頂上から" + (s.size(DoubleHeadIntStack.AorB.StackB) - (s.getCapacity() - n) + 1) +"番目に存在します。");
				else
					System.out.println("そのデータはありません。");
				break;

			 case 12:													// 空にする
				s.clear(DoubleHeadIntStack.AorB.StackB);
				break;

			 case 13:													// 情報表示
				System.out.println("容量：" + s.getCapacity());
				System.out.println("Ａのデータ数：" + s.size(DoubleHeadIntStack.AorB.StackA));
				System.out.println("Ｂのデータ数：" + s.size(DoubleHeadIntStack.AorB.StackB));
				System.out.println("Ａは空" + (s.isEmpty(DoubleHeadIntStack.AorB.StackA) ? "です。"
																										: "ではありません。"));
				System.out.println("Ｂは空" + (s.isEmpty(DoubleHeadIntStack.AorB.StackB) ? "です。"
																										: "ではありません。"));
				System.out.println("満杯" + (s.isFull() ? "です。"
																										: "ではありません。"));
				break;
			}
		}
	}
}

