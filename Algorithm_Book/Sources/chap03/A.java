// 自然な順序付けのできるクラスの定義方法
class A implements Comparable<A> {

	// フィールドやメソッドなど

	public int compareTo(A c) {
		// thisがcより大きければ正の値を、
		// thisがcより小さければ負の値を、
		// thisがcと等しければ0を返す。
	}

	public boolean equals(Object c) {
		// thisがcと等しければtrueを、
		// thisがcと等しくなければfalseを返す。
	}
}
