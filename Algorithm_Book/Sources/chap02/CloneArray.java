// 配列の複製を作る

import java.util.Arrays;

class CloneArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();			// bはaの複製を参照

		b[3] = 0;									// １要素だけ落書き

		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));
	}
}
