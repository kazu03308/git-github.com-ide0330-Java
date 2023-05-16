// 演習4-3
// 両頭int型固定長スタック

public class DoubleHeadIntStack {
	private int[] stk;		// スタックの本体
	private int capacity;	// スタックの容量（Ａ・Ｂの合計）
	private int ptrA;			// スタックポインタＡ
	private int ptrB;			// スタックポインタＢ

	public enum AorB {StackA, StackB};

	//--- 実行時例外：スタックが空 ---//
	public class EmptyDoubleHeadIntStackException extends RuntimeException {
		public EmptyDoubleHeadIntStackException() { }
	}

	//--- 実行時例外：スタックが満杯 ---//
	public class OverflowDoubleHeadIntStackException extends RuntimeException {
		public OverflowDoubleHeadIntStackException() { }
	}

	//--- コンストラクタ ---//
	public DoubleHeadIntStack(int maxlen) {
		ptrA = 0;
		ptrB = maxlen - 1;
		capacity  = maxlen;
		try {
			stk = new int[capacity];				// スタック本体用の配列を生成
		} catch (OutOfMemoryError e) {		// 生成できなかった
			capacity = 0;
		}
	}

	//--- スタックにxをプッシュ ---//
	public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException {
		if (ptrA >= ptrB + 1)							// スタックは満杯
			throw new OverflowDoubleHeadIntStackException();
		switch (sw) {
		 case StackA: stk[ptrA++] = x; break;
		 case StackB: stk[ptrB--] = x; break;
		}
		return x;
	}

	//--- スタックからデータをポップ（頂上のデータを取り出す） ---//
	public int pop(AorB sw) throws EmptyDoubleHeadIntStackException {
		int x = 0;
		switch (sw) {
		 case StackA: 
			if (ptrA <= 0)									// スタックＡは空
				throw new EmptyDoubleHeadIntStackException();
			x = stk[--ptrA];
			break;
		 case StackB:
			if (ptrB >= capacity - 1)				// スタックＢは空
				throw new EmptyDoubleHeadIntStackException();
			x = stk[++ptrB];
			break;
		}
		return x;
	}

	//--- スタックからデータをピーク（頂上のデータを覗き見） ---//
	public int peek(AorB sw) throws EmptyDoubleHeadIntStackException {
		int x = 0;
		switch (sw) {
		 case StackA: 
			if (ptrA <= 0)									// スタックＡは空
				throw new EmptyDoubleHeadIntStackException();
			x = stk[ptrA - 1];
			break;
		 case StackB:
			if (ptrB >= capacity - 1)				// スタックＢは空
				throw new EmptyDoubleHeadIntStackException();
			x = stk[ptrB + 1];
			break;
		}
		return x;
	}

	//--- スタックからxを探してインデックス（見つからなければ-1）を返す ---//
	public int indexOf(AorB sw, int x) {
		switch (sw) {
		 case StackA: 
			for (int i = ptrA - 1; i >= 0; i--)				// 頂上側から線形探索
				if (stk[i] == x)
					return i;							// 探索成功
			break;
		 case StackB:
			for (int i = ptrB + 1; i < capacity; i++)	// 頂上側から線形探索
				if (stk[i] == x)
					return i;						// 探索成功
			break;
		}
		return -1;								// 探索失敗
	}

	//--- スタックを空にする ---//
	public void clear(AorB sw) {
		switch (sw) {
		 case StackA: ptrA = 0; break;
		 case StackB: ptrB = capacity - 1; break;
		}
	}

	//--- スタックの容量を返す（ＡとＢの合計）---//
	public int getCapacity() {
		return capacity;
	}

	//--- スタックに積まれているデータ数を返す ---//
	public int size(AorB sw) {
		switch (sw) {
		 case StackA: return ptrA;
		 case StackB: return capacity - ptrB - 1;
		}
		return 0;
	}

	//--- スタックは空であるか ---//
	public boolean isEmpty(AorB sw) {
		switch (sw) {
		 case StackA: return ptrA <= 0;
		 case StackB: return ptrB >= capacity - 1;
		}
		return true;
	}

	//--- スタックは満杯であるか ---//
	public boolean isFull() {
		return ptrA >= ptrB + 1;
	}

	//--- スタック内の全データを底→頂上の順に表示 ---//
	public void dump(AorB sw) {
		switch (sw) {
		 case StackA:
			if (ptrA <= 0)
				System.out.println("スタックは空です。");
			else {
				for (int i = 0; i < ptrA; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		 case StackB:
			if (ptrB >= capacity - 1)
				System.out.println("スタックは空です。");
			else {
				for (int i = capacity - 1; i > ptrB; i--)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		}
	}
}
