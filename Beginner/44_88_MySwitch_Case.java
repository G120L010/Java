package helloworld;

import javax.swing.JOptionPane;

public class MySwitch_Case {

	public static void main(String[] args) {
		// 1. 用 JOptionPane.showInputDialog() 建立輸入視窗，提示使用者輸入月份
		String num = JOptionPane.showInputDialog("請輸入月份");

		// 2. 使用 switch-case 判斷不同月份
		// 語意：根據輸入的值，選擇對應的 case 執行
		// 如果符合某個 case，就執行該區塊，通常搭配 break 結束判斷
		switch (num) {
		// 多個 case 可以合併，代表相同的結果
		case "一月":
		case "三月":
		case "五月":
		case "七月":
		case "八月":
		case "十月":
		case "十二月":
			System.out.println("31天");
			break;

		case "二月":
			System.out.println("28天");
			break;

		case "四月":
		case "六月":
		case "九月":
		case "十一月":
			System.out.println("30天");
			break;

		// default：以上條件都不成立時執行
		default:
			System.out.println("輸入錯誤或不存在的月份");
			break;
		}
		// --- 邏輯推斷 ---
		// 1. 使用者輸入月份 (字串)
		// 2. switch-case 依照輸入的值進行判斷：
		//
		// case "一月"、"三月"、"五月"、"七月"、"八月"、"十月"、"十二月"
		// → 輸出「31天」
		//
		// case "二月"
		// → 輸出「28天」
		//
		// case "四月"、"六月"、"九月"、"十一月"
		// → 輸出「30天」
		//
		// default
		// → 輸出「輸入錯誤或不存在的月份」
		//
		// 👉 程式只會執行符合的第一個 case 區塊，並在 break 後結束判斷。
		//		    這就是 switch-case 的「固定值多重選擇」結構。
	}
}
