// クラスXの内部でコンパレータCOMPARATORを定義

import java.util.Comparator;

class X {

	// フィールドやメソッドなど

	public static final Comparator<T> COMPARATOR = new Comp();

	private static class Comp implements Comparator<T> {
		public int compare(T d1, T d2) {
			// d1がd2より大きければ正の値を、
			// d1がd2より小さければ負の値を、
			// d1がd2と等しければ0を返す。
		}
	}
}
