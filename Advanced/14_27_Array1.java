package advanced;

/* Array1 類別：示範二維陣列的建立與使用一般 for 迴圈走訪 */
public class Array1 {

	public static void main(String[] args) {

		// 宣告一個 5x3 的二維陣列（固定大小）
		int[][] array = new int[5][3];

		// 設定第一列的值
		array[0][0] = 7;
		array[0][1] = 8;
		array[0][2] = 9;

		// 取得指定位置的值（目前被註解）
		// System.out.println(array[0][2]);

		// 宣告一個不規則二維陣列（每列長度不同）
		int[][] array2 = { 	{ 1, 2, 3, 4 }, 		// 第 0 列（長度 4）
							{ 5, 6 }, 				// 第 1 列（長度 2）
							{ 7, 8, 9, 10, 11, 15 } // 第 2 列（長度 6）
						};
		// 取得第 2 列（index = 2），並存成一維陣列
		int[] arr = array2[2];

		// 使用一般 for 迴圈走訪二維陣列
		for (int i = 0; i < array2.length; i++) { // 控制「列（row）」

			// System.out.println(array2[i]);
			// 印出的是記憶體位址（參考值），不是內容

			for (int j = 0; j < array2[i].length; j++) { // 控制「行（column）」
				System.out.print(array2[i][j] + ","); // 印出每個元素
			}
			System.out.println(); // 每列印完後換行
		}
	}
}
