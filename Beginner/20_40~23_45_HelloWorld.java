package helloworld;

/* 在專案中的類別HelloWorld建立人生首支程式
 * 功能：在主控台輸出 "Hello World!!" */
public class HelloWorld {

	/** 主程式進入點
	    @param args 命令列參數 */
	public static void main(String[] args) {

		// Java 變數命名規則
		// 一. 可用：英文字母、數字、_、$、Unicode(如中文)
		// 二. 不可：數字開頭、Java 關鍵字
		// 三. ; 為程式敘述結束
		// 四. 多單字使用駝峰式命名 camelCase（第一字小寫，其後單字開頭大寫）
		int $_idAge年齡 = 18; // 命名規則測試
		// Java 變數命名規則歷史(不用會)小常識：
		// "$" 開頭 → 用來表示系統或內部使用的靜態變數
		// "_" 開頭 → 用來表示私有或隱藏用途的變數
		int userAge = 20; // camelCase 範例

		// 在主控台(Console)輸出程式運行結果
		System.out.println($_idAge年齡);
		System.out.println(userAge);
		System.out.println("Hello World!!");

		// ===== Eclipse 常用快捷鍵 =====

		// 快速註解 / 取消註解
		// Ctrl + /

		// 自動提示 / 自動完成 (Content Assist)
		// Alt + /

		// 常用自動完成範例：
		// main + Alt + / → 產生 main 方法
		// sysout + Alt + / → 產生 System.out.println()

		// 程式碼行移動（上下搬移）
		// Alt + ↑ / ↓

		// 複製程式碼行（向上或向下複製）
		// Ctrl + Alt + ↑ / ↓

		// 自動格式化程式碼（排版）
		// Ctrl + Shift + F
	}
}
