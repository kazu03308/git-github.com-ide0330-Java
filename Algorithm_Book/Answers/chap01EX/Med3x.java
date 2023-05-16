// 演習1-5
// 三つの整数値の中央値を求めて表示（別解）

/*
　最初のif文の判定
　　if ((b >= a && c<= a) || (b <= a && c >= a)
に着目します。ここでb >= aおよびb <= aの判定を裏返した判定（実質的に同一の判定）が、続くelse以降で
　　else if ((a > b && c < b) || (b <= a && c > b)
と行われます。つまり、最初のifが成立しなかった場合、2番目のifでも（実質的に）同じ判定を行っているため、効率が悪くなるのです。
*/

class Med3x {

	//--- a, b, cの中央値を求めて返却（別解） ---//
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3,2,1));      // a＞b＞c
		System.out.println("med3(3,2,2) = " + med3(3,2,2));      // a＞b＝c
		System.out.println("med3(3,1,2) = " + med3(3,1,2));      // a＞c＞b
		System.out.println("med3(3,2,3) = " + med3(3,2,3));      // a＝c＞b
		System.out.println("med3(2,1,3) = " + med3(2,1,3));      // c＞a＞b
		System.out.println("med3(3,3,2) = " + med3(3,3,2));      // a＝b＞c
		System.out.println("med3(3,3,3) = " + med3(3,3,3));      // a＝b＝c
		System.out.println("med3(2,2,3) = " + med3(2,2,3));      // c＞a＝b
		System.out.println("med3(2,3,1) = " + med3(2,3,1));      // b＞a＞c
		System.out.println("med3(2,3,2) = " + med3(2,3,2));      // b＞a＝c
		System.out.println("med3(1,3,2) = " + med3(1,3,2));      // b＞c＞a
		System.out.println("med3(2,3,3) = " + med3(2,3,3));      // b＝c＞a
		System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c＞b＞a
	}
}
