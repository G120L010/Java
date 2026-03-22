package helloworld;

public class arr {

	public static void main(String[] args) {

		int[] arr0 = new int[5];
		// 建立一個 int 陣列，長度為 5
		// 裡面有 5 個元素，預設值都是 0

		double[] arr1 = new double[5];
		// 建立 double 陣列，長度為 5
		// 預設值都是 0.0

		boolean[] arr2 = new boolean[1];
		// 建立 boolean 陣列，長度為 1
		// 預設值為 false

		System.out.println(arr0[4]);
		// 取得 arr0 第5個元素 (index=4)
		// int 陣列預設值為 0

		System.out.println(arr1[0]);
		// 取得 arr1 第1個元素 (index=0)
		// double 陣列預設值為 0.0

		System.out.println(arr2[0]);
		// 取得 arr2 第1個元素
		// boolean 陣列預設值為 false

		int[] arr = { 1, 2, 3, 4 };
		// 宣告並初始化陣列
		// int[] 代表「整數陣列型別」
		// 陣列本身不是基本型別，而是「參考型別 (Reference Type)」

		System.out.println("before：" + arr[0]);
		// 顯示 arr 第1個元素
		// 陣列索引(index)從 0 開始

		arr[0] = 50;
		// 將 index=0 的值從 1 改為 50

		System.out.println("after：" + arr[0]);
		// 再次印出 arr[0]，結果會變成 50

		System.out.println(arr.length);
		// length (長度) 是陣列的「屬性 (field)」
		// 用來取得陣列長度
		// 這個陣列有 4 個元素，所以結果是 4
		
		System.out.println(arr);
		// 直接印出陣列變數 → 輸出的是記憶體位址 (例如 [I@15db9742)
        // 因為陣列是「參考型別」，不是基本型別
        // 如果要印出內容，要用 Arrays.toString(arr)
        // 範例：System.out.println(Arrays.toString(arr)); → [50, 2, 3, 4]
	}
}
