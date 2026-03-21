package helloworld;
//Com_par_i_son，比較（讀音：kum-PAIR-ih-sun）
public class Comparison {

	public static void main(String[] args) {
		// 資料型別：決定這個抽屜的大小。
		// 變數名稱：是抽屜的標籤，方便找它。
		// 賦予數值：是抽屜裡面裝的東西。
		int a = 28;//資料型別 變數名稱(a) = 數值;
		int b = 18;//資料型別 變數名稱(b) = 數值;
		System.out.println("大於等於" + (a >= b)); // a大於等於b：true
		System.out.println("小於等於" + (a <= b));// a小於等於b：false
		System.out.println("等於" + (a == b));  // a等於b：false
		System.out.println("大於" + (a > b));    // a大於b：true
		System.out.println("小於" + (a < b));   // a小於b：false
		System.out.println("不等於" + (a != b));// a不等於b：true

	}// 對齊 main 方法的 (public) 結束括號

}// 對齊 Comparison 類別的 (public) 結束括號
