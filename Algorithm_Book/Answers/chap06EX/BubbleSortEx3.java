// 演習6-4
// 単純交換ソート（第３版：交換の詳細を表示）

import java.util.Scanner;

class BubbleSortEx3 {

	//--- 配列の要素a[idx1]とa[idx2]を交換 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}

	//--- 単純交換ソート ---//
	static void bubbleSort(int[] a, int n) {
		int ccnt = 0;			// 比較回数
		int scnt = 0;			// 交換回数

		int i = 0;
		int k = 0;							// a[k]より前はソート済み
		while (k < n - 1) {
			System.out.printf("パス%d：\n", ++i);
			int last = n - 1;			// 最後に交換した位置
			for (int j = n - 1; j > k; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c" , a[m], (m != j-1) ? ' ' :
											(a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);
				ccnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
					scnt++;
				}
			}
			k = last;
		}
		System.out.println("比較は" + ccnt + "回でした。");
		System.out.println("交換は" + scnt + "回でした。");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("単純交換ソート（バブルソート）");
		System.out.print("要素数：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx);				// 配列xを単純交換ソート

		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}