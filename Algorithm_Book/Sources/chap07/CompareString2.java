// 文字列の大小関係の判定

import java.util.Scanner;

class CompareString2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列s1：");  String s1 = stdIn.next();
		System.out.print("文字列s2：");  String s2 = stdIn.next();

		int comp = s1.compareTo(s2);
		if (comp < 0)
			System.out.println("s1 < s2です。");
		else if (comp > 0)
			System.out.println("s1 > s2です。");
		else
			System.out.println("s1 == s2です。");
	}
}
