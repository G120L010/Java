package helloworld;

public class ExLogical {

	public static void main(String[] args) {

		int age = 25; // 資料型態為整數，建立年齡變數為25歲

		// 題目 1：18 < age < 80，意思是 age 大於 18 且 小於 80
		// 邏輯解讀：使用 && (AND)，代表必須「同時滿足」大於 18 且 小於 80。
		if (18 < age && age < 80) {
			System.out.println("範圍內"); // 因為 25 符合「大於 18」且「小於 80」，結果為 true。
		} else {
			System.out.println("範圍外");
		}

		// 題目 2：age 小於等於 18 或 age 大於等於 80
		// 邏輯解讀：使用 || (OR)，代表「只要滿足其中一個」條件即為 true。
		/*
		 * ⚠️修正重點：25 歲並不符合這兩個條件！ 25 <= 18 是 false，25 >= 80 也是 false。 所以 (false || false)
		 * 結果是 false，會跳到 else。
		 */
		if (age <= 18 || age >= 80) {
			System.out.println("範圍內");
		} else {
			System.out.println("範圍外"); // 註：25 歲既不小於 18 也不大於 80，所以印出「範圍外」。
		}

	}

}
