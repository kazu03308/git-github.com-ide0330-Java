// 演習6-11
// クイックソート（非再帰版：スタックへのプッシュ・ポップの様子を表示）

import java.util.Scanner;

class QuickSort2Verbose {

	//--- 配列の要素a[idx1]とa[idx2]を交換 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}

	//--- クイックソート（非再帰版）---//
	static void quickSort(int[] a, int left, int right) {
		IntStack lstack = new IntStack(right-left+1);
		IntStack rstack = new IntStack(right-left+1);

		lstack.push(left);
		rstack.push(right);
		System.out.printf("a[%d]～a[%d]を分割する問題をスタックにプッシュします。\n", left, right);
		System.out.print("Lstack:"); lstack.dump();
		System.out.print("Rstack:"); rstack.dump();

		while (lstack.isEmpty() != true) {
			int pl = left  = lstack.pop();			// 左カーソル
			int pr = right = rstack.pop();			// 右カーソル
			int x = a[(left + right) / 2];			// 枢軸は中央の要素
			System.out.printf("スタックから分割する問題を取り出しました。a[%d]～a[%d]を分割します。\n", left, right);

			do {
				while (a[pl] < x) pl++;
				while (a[pr] > x) pr--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			} while (pl <= pr);

			if (left < pr) {
				lstack.push(left);			// 先頭側グループの範囲
				rstack.push(pr);				// （インデックス）をプッシュ
				System.out.printf("a[%d]～a[%d]を分割する問題をスタックにプッシュします。\n", left, pr);
				System.out.print("Lstack:"); lstack.dump();
				System.out.print("Rstack:"); rstack.dump();
			}
			if (pl < right) {
				lstack.push(pl);				// 末尾側グループの範囲
				rstack.push(right);			// （インデックス）をプッシュ
				System.out.printf("a[%d]～a[%d]を分割する問題をスタックにプッシュします。\n", pl, right);
				System.out.print("Lstack:"); lstack.dump();
				System.out.print("Rstack:"); rstack.dump();
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("クイックソート");
		System.out.print("要素数：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		quickSort(x, 0, nx - 1);			// 配列xをクイックソート

		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}
}

