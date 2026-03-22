package helloworld;

import javax.swing.JOptionPane;

public class Myif_else_if_else {//多重if_else

	public static void main(String[] args) {
		// if (第一條件) {
		// } else if (第二條件) {
		// } else {
		// }
		// if-else if-else 是「多重選擇」的結構
		// 語意：如果是(第一條件)的狀態下就進行{流程一}，其它又或是(第二條件)的話就進行{流程二}，如果都不是就進行{流程三}

		// 1. 用 JOptionPane.showInputDialog() 建立輸入視窗，提示使用者輸入年齡
		String asgString = JOptionPane.showInputDialog("請輸入年齡");

		// 2. 因為輸入的是字串 (String)，要用 Integer.valueOf() 轉成 int 型態
		int age = Integer.valueOf(asgString);

		// 3. 使用 if-else if-else 判斷
		// --- 年齡分段範例 ---
		// if (age >= 18) → 成年（年齡大於等於 18）
		// else if (age <= 5) → 幼兒（年齡小於等於 5）
		// else → 其他狀況（例如 6~17 歲 → 青少年）
		if (age >= 18) {
			System.out.println("成年人");
		} else if (age <= 5) {
			System.out.println("幼兒");
		} else {
			System.out.println("青少年");
		}
		// --- 邏輯推斷 ---
		// 1. 先判斷 age >= 18 （年齡大於等於 18）
		// ✔ 如果成立 → 輸出「成年」
		// ✘ 如果不成立 → 繼續往下判斷
		//
		// 2. 再判斷 age <= 5 （年齡小於等於 5）
		// ✔ 如果成立 → 輸出「未成年(<=5)」
		// ✘ 如果不成立 → 繼續往下判斷
		//
		// 3. 以上條件都不成立 → 執行 else
		// → 輸出「其他狀況」
		//
		// 👉 程式只會執行第一個符合條件的區塊，後面就不再判斷。
		// 這就是 if-else if-else 的「多重選擇」結構。

		// --- 比較運算子中文對照表 ---
		// > 大於
		// >= 大於等於
		// < 小於
		// <= 小於等於
		// == 等於
		// != 不等於
	}
}
