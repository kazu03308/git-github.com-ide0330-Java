// 演習4-7
// int型固定長デック

public class IntDeque {

	//--- 実行時例外：キューが空 ---//
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() { }
	}

	//--- 実行時例外：キューが満杯 ---//
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() { }
	}

	private int[] que;			// デックの本体
	private int capacity;		// デックの容量
	private int num;				// 現在のデータ数
	private int front;			// 先頭要素カーソル
	private int rear;				// 末尾要素カーソル

	//--- コンストラクタ ---//
	public IntDeque(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];				// デック本体用の配列を生成
		} catch (OutOfMemoryError e) {		// 生成できなかった
			capacity = 0;
		}
	}

	//--- デックにデータを先頭側からエンキュー ---//
	public int enqueFront(int x) throws OverflowIntDequeException {
		if (num >= capacity)
			throw new OverflowIntDequeException();		// デックは満杯
		num++;
		if (--front < 0)
			front = capacity - 1;
		que[front] = x;
		return x;
	}

	//--- デックにデータを末尾側からエンキュー ---//
	public int enqueRear(int x) throws OverflowIntDequeException {
		if (num >= capacity)
			throw new OverflowIntDequeException();		// デックは満杯
		que[rear++] = x;
		num++;
		if (rear == capacity)
			rear = 0;
		return x;
	}

	//--- デックの先頭からデータをデキュー ---//
	public int dequeFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException();				// デックは空
		int x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	//--- デックの末尾からデータをデキュー ---//
	public int dequeRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException();				// デックは空
		num--;
		if (--rear < 0)
			rear = capacity - 1;
		return que[rear];
	}

	//--- デックの先頭からデータをピーク（先頭データを覗く） ---*/
	public int peekFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException();				// デックは空
		return que[front];
	}

	//--- デックの末尾からデータをピーク（末尾データを覗く） ---*/
	public int peekRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException();				// デックは空
		return que[rear == 0 ? capacity - 1 : rear - 1];
	}

	//--- デックからxを探してインデックス（見つからなければ-1）を返す ---//
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if (que[idx] == x)											// 探索成功
				return idx;
		}
		return -1;																// 探索失敗
	}

	//--- デックからxを探して先頭から何番目か（見つからなければ0）を返す ---//
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % capacity]  == x)	// 探索成功
				return i + 1;
		return 0;																	// 探索失敗
	}

	//--- デックを空にする ---//
	public void clear() {
		num = front = rear = 0;
	}

	//--- デックの容量を返す ---//
	public int getCapacity() {
		return capacity;
	}

	//--- デックに蓄えられているデータ数を返す ---//
	public int size() {
		return num;
	}

	//--- デックは空であるか ---//
	public boolean isEmpty() {
		return num <= 0;
	}

	//--- デックは満杯であるか ---//
	public boolean isFull() {
		return num >= capacity;
	}

	//--- デック内の全データを先頭→末尾の順に表示 ---//
	public void dump() {
		if (num <= 0)
			System.out.println("デックは空です。");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % capacity] + " ");
			System.out.println();
		}
	}
}

