package helloworld;

import javax.swing.JOptionPane; // 引用工具：JOptionPane 用來建立視窗對話框

public class MyStringBMI {//字串型態 轉成對應 整數型態 教學

	public static void main(String[] args) {
		// --- 建立視窗：輸入身高 ---
		// JOptionPane.showInputDialog("請輸入身高(米)");
		// 1. 跳出一個輸入視窗，提示「請輸入身高(米)」
		// 2. 使用者輸入的資料會以字串 (String) 型態回傳
		String height = JOptionPane.showInputDialog("請輸入身高(米)");

		// --- 建立視窗：輸入體重 ---
		// 同樣跳出輸入視窗，提示「請輸入體重(KG)」
		// 回傳的資料也是字串 (String)
		String weight = JOptionPane.showInputDialog("請輸入體重(KG)");

		// --- 情況 3：字串轉數值 ---
		// 因為 height 和 weight 是字串型態，不能直接做數學運算
		// 所以要用 Double.valueOf() 把字串轉成 double 型態
		// 注意：不能用強制轉型 (例如 (int)"123")，這樣會編譯錯誤
		// 錯誤語法：int i =(int)height;
		// 錯誤語法：int j =(int)weight;
		double heightValue = Double.valueOf(height);
		double weightValue = Double.valueOf(weight);

		// --- 情況 4：計算 BMI ---
		// BMI公式：體重(公斤) ÷ (身高(米) × 身高(米))
		// 這裡直接用 System.out.println() 輸出計算結果
		System.out.println(weightValue / (heightValue * heightValue));
	}
}
// --- 學習筆記整理 ---
// 掌握 BMI 計算流程：
// 1. 用 JOptionPane.showInputDialog() 接收字串輸入
// 2. 用 Double.valueOf() 把字串轉成 double 型態
// 3. 套用公式：體重 ÷ (身高 × 身高)
// 4. 用 System.out.println() 輸出結果

// --- 型態轉換注意事項 ---
// 1. String 不能直接強制轉型成 int 或 double
//    例如：(int)"123" → 錯誤！編譯不過
// 2. 正確做法：使用包裝類別的轉換方法
//    - Integer.valueOf("123") → 轉成 int
//    - Double.valueOf("123.45") → 轉成 double
// 3. 這樣才能把字串型態的輸入，安全地轉換成數值型態，進行數學運算
