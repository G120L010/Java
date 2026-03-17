package helloworld;
public class Var {
	public static void main(String[] args) {
		
		// var：自動型別推斷（由右邊的值決定型別）
		// 建議少用，避免型別不清楚
		var no = "不確定資料型別";  // 等同於 String no = "不確定資料型別";
		System.out.println(no);   // 輸出變數內容到主控台
	}
}
