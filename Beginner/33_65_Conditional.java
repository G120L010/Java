package helloworld;

//con_di_tion_al，條件（讀音：kun-DISH-un-ul）
public class Conditional {

	public static void main(String[] args) {
		// 老師舉例：使用「條件運算子」判斷是否符合免運費的條件
		boolean isVIP = true; // 資料型別 變數名稱(isVIP) = true; (代表它是VIP會員)
		int amount = 300; // 資料型別 變數名稱(amount) = 300; (代表購物金額)

		// 1. && (AND，M的)：邏輯與 (Logical AND)
		// 規則：必須「同時符合」兩個條件，結果才會是 true。
		// 案例：必須是 VIP 且 金額大於 500 元才免運。
		System.out.println("是否符合免運(需兩者皆滿足)：" + (isVIP && amount > 500) );
		// 註解：因為 300 沒有大於 500，所以結果為 false。

		// 2. || (OR，O兒)：邏輯或 (Logical OR)
		// 規則：只要「其中一個」條件符合，結果就是 true。
		// 案例：只要是 VIP，或是金額大於 500 元，其中一項達成即免運。
		System.out.println("是否符合免運(滿足其一即可)：" + (isVIP || amount > 500) );
		// 註解：雖然金額不足，但因為是 VIP (true)，所以結果為 true。

		// 3. ! (NOT，那特)：邏輯非 (Logical NOT)
		// 規則：把結果「反過來」。如果是 true 就變 false，如果是 false 就變 true。
		// 案例：判斷「如果『不是』VIP」的情況。
		System.out.println("是否符合『不是』VIP：" + (!isVIP) );
		// 註解：因為 isVIP 是 true，再加上 ! 就會變成 false。

	}// 對齊 main 方法的結束括號

}// 對齊 Conditional 類別的結束括號
