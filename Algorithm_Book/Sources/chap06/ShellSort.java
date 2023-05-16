// シェルソート（第１版）

import java.util.Scanner;

class ShellSort {

	//--- シェルソート ---//
	static void shellSort(int[] a, int n) {
		for (int h = n / 2; h > 0; h /= 2)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
					a[j + h] = a[j];
				a[j + h] = tmp;
			}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("シェルソート");
		System.out.print("要素数：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		shellSort(x, nx);			// 配列xをシェルソート

		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}
