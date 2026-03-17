package helloworld;

//Java 基本宣告說明（老師講解版本）
//public class Var 是在「宣告」一個類別
//意思為：宣告一個公開的類別，名稱叫 Var
public class Var {

	// public：公開的（類別或方法可以被其他地方存取）
	// static：靜態的（不需要建立物件即可使用）
	// void：表示沒有回傳值
	// main：主程式入口名稱（程式從這裡開始執行）
	// String[] args：接收命令列參數
	// 宣告一個(公開、靜態、無回傳值)的方法，方法名稱叫做main
	public static void main(String[] args) {

		// var：自動型別推斷（由右邊的值決定型別）
		// 建議少用，避免型別不清楚
		var no = "不確定資料型別"; // 等同於 String no = "不確定資料型別";
		System.out.println(no); // 輸出變數內容到主控台
	}
}
