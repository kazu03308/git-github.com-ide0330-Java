// 部分文字列の取出し

import java.util.Scanner;

class Substring {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列s：");  String s = stdIn.next();
		System.out.print("開始インデックスbegin：");  int begin = stdIn.nextInt();
		System.out.print("終了インデックスend  ：");  int end = stdIn.nextInt();

		System.out.println("s.substring(begin)      = " + s.substring(begin));
		System.out.println("s.substring(begin, end) = " + s.substring(begin, end));
	}
}
