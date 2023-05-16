// 演習6-9
// ２分挿入ソート

import java.util.Scanner;

class BinInsertionSort {

	//--- ２分挿入ソート ---//
	static void binInsertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int key = a[i];
			int pl = 0;				// 探索範囲先頭の添字
			int pr = i - 1;		// 　 〃 　末尾の添字
			int pc;						// 　 〃 　中央の添字
			int pd;						// 挿入すべ位置の添字

			do {
				pc = (pl + pr) / 2;
				if (a[pc] == key)			// 探索成功
					break;
				else if (a[pc] < key)
					pl = pc + 1;
				else
					pr = pc - 1;
			} while (pl <= pr);
			pd = (pl <= pr) ? pc + 1 : pr + 1;

			for (int j = i; j > pd; j--)
				a[j] = a[j - 1];
			a[pd] = key;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("２分挿入ソート");
		System.out.print("要素数：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		binInsertionSort(x, nx);			// 配列xを２分挿入ソート

		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}

