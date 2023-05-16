// 暦の配列をソート

import java.util.Arrays;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

class SortCalendar {

	public static void main(String[] args) {
		GregorianCalendar[] x = {
			new GregorianCalendar(2022, NOVEMBER, 1),		// 2022年11月01日
			new GregorianCalendar(1963, OCTOBER, 18),		// 1963年10月18日
			new GregorianCalendar(1985, APRIL, 5),			// 1985年04月05日
		};

		Arrays.sort(x);  // 配列xをソート

		for (int i = 0; i < x.length; i++)
			System.out.printf("%04d年%02d月%02d日\n", x[i].get(YEAR),
																								x[i].get(MONTH) + 1,
																								x[i].get(DATE));
	}
}
