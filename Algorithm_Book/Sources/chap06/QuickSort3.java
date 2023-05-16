// クイックソート（改良版）

import java.util.Scanner;

class QuickSort3 {

	//--- 配列の要素a[idx1]とa[idx2]の値を交換 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}

	//--- x[a], x[b], x[c]をソート（中央値のインデックスを返却）---//
	static int sort3elem(int[] x, int a, int b, int c) {
		if (x[b] < x[a]) swap(x, b, a);
		if (x[c] < x[b]) swap(x, c, b);
		if (x[b] < x[a]) swap(x, b, a);
		return b;
	}

	//--- クイックソート ---//
	static void quickSort(int[] a, int left, int right) {
		int pl = left;							// 左カーソル
		int pr = right;							// 右カーソル
		int m = sort3elem(a, pl, (pl + pr) / 2, pr);	// 先頭・末尾・中央をソート
		int x = a[m];								// 枢軸

		swap(a, m, right - 1);			// 中央と末尾から２番目を交換
		pl++;												// 左カーソルを１個右へ
		pr -= 2;										// 右カーソルを２個左へ

		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);

		if (left < pr)  quickSort(a, left, pr);
		if (pl < right) quickSort(a, pl, right);
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
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}
