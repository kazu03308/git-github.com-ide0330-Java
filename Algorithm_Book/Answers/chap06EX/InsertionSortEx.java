// 演習6-7
// 単純挿入ソート（詳細を表示）

import java.util.Scanner;

class InsertionSortEx {

	//--- 単純挿入ソート ---//
	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			for (int m = 0; m < n; m++)
				System.out.printf("%3d ", a[m]);
			System.out.println();

			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j] = tmp;

			System.out.print(" ".repeat(4 * j));
			System.out.print(i != j ? "^-" : "  ");
			System.out.print("-".repeat(4 * (i - j)));
			System.out.println("+");
			System.out.printf("a[%d]の%dをa[%d]の位置に挿入しました。\n\n", i, tmp, j);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("単純挿入ソート");
		System.out.print("要素数：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		insertionSort(x, nx);			// 配列xを単純挿入ソート

		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}

