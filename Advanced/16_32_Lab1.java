package advanced;
/*Lab1 類別：示範二維陣列（矩陣）轉置（Transpose）*/
public class Lab1 {

	public static void main(String[] args) {

		// 原始二維陣列（4x2 矩陣）
		int[][] q = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };

		// 建立轉置後的陣列（2x4 矩陣）
		// 行列互換：原本是 q[4][2] → 變成 ans[2][4]
		int[][] ans = new int[q[0].length][q.length];

		// 進行矩陣轉置
		// 規則：ans[j][i] = q[i][j]
		for (int i = 0; i < q.length; i++) { // 走訪每一列
			for (int j = 0; j < q[i].length; j++) { // 走訪每一行
				ans[j][i] = q[i][j]; // 將列與行對調
			}
		}
		// 使用增強型 for 迴圈（for-each）印出轉置後的矩陣
		for (int[] is : ans) { // 每一列（row）
			for (int i : is) { // 該列中的每個元素
				System.out.print(i + ","); // 印出元素並加上逗號
			}
			System.out.println(); // 換行
		}
	}
}
