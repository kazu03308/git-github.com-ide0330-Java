// 演習6-5
// 双方向バブルソート（シェーカーソート）

import java.util.Scanner;

class ShakerSort {

	//--- 配列の要素a[idx1]とa[idx2]を交換 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}

	//--- 双方向バブルソート（シェーカーソート）---//
	static void shakerSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;

		while (left < right){
			for (int j = right; j > left; j--){
				if (a[j - 1] > a[j]){
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++){
				if (a[j] > a[j + 1]){
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("双方向バブルソート（シェーカーソート）");
		System.out.print("要素数：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		shakerSort(x, nx);				// 配列xを双方向バブルソート

		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}

