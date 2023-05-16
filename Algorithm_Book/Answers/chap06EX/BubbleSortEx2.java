// 演習6-3
// 単純交換ソート（第２版：交換の詳細を表示）

import java.util.Scanner;

class BubbleSortEx2 {

	//--- 配列の要素a[idx1]とa[idx2]を交換 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}

	//--- 単純交換ソート ---//
	static void bubbleSort(int[] a, int n) {
		int ccnt = 0;			// 比較回数
		int scnt = 0;			// 交換回数

		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;								// パスにおける交換回数
			System.out.printf("パス%d：\n", i + 1);

			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c" , a[m], (m != j-1) ? ' ' :
											(a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
					scnt++;
				}
			}
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  " , a[m]);
			System.out.println();
			if (exchg == 0) break;					// 交換が行われなかったら終了
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

