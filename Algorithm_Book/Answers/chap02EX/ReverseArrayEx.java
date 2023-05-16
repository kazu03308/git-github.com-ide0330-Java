// 演習2-2
// 配列の要素に値を読み込んで並びを反転する（経過を表示）

import java.util.Arrays;
import java.util.Scanner;

class ReverseArrayEx {

	//--- 配列の要素a[idx1]とa[idx2]を交換 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}

	//--- 配列aの要素の並びを逆転 ---//
	static void reverse(int[] a) {
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]とa[" + (a.length - i - 1) + "]を交換します。");
			swap(a, i, a.length - i - 1);
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数は：");
		int num = stdIn.nextInt();      // 要素数

		int[] x = new int[num];         // 要素数numの配列

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		reverse(x);      // 配列aの要素の並びを逆転

		System.out.println("反転が終了しました。");
	}
}

