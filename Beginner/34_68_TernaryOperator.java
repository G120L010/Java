package helloworld;
/**三元運算子觀念筆記】
 * 1. 三元運算子根據場合會有不同答案。
 * 2. 在邏輯上，三元運算子跟 if-else 不一樣（三元是「表達式」，必須回傳一個值）。
 * 3. 在行為或結果上，三元運算子跟 if-else 一樣（都能達到條件分支的效果）。     */
public class TernaryOperator {
	public static void main(String[] args) {

		// 原始程式：true ? false ? "A" : "B" : "C"
		String x = false ? false ? "A" : "B" : "C" ;
		System.out.println(x);
		
		// 這一行是「巢狀」三元運算子，建議新手閱讀時加上括號 ( ) 會更清楚：
		System.out.println(true ? (true ? "A" : "B") : "C");

		/* --- 邏輯拆解：由外而內，由第一層 而"向內"到 第二層 ---
		 * 口訣：問號 (?) = if，冒號 (:) = else
		 * * 步驟 1：第一個條件是 true → 進入第一層的「肯定區」。
		 * 此時最後方的 : "C" (第一層 else) 直接作廢不看。
		 * * 步驟 2：剩下的部分是 false ? "A" : "B"
		 * 第二個條件是 false → 進入第二層的「否定區」。
		 * * 步驟 3：前面的 "A" (第二層 if) 作廢，最終答案就是 "B"。   */
		System.out.println("---------- 對照 if-else 版本 ----------");
		// 用 if-else 還原真相 (層級完全對應)
		if (true) {                    // 第一層【  ?對應(if) 】
			if (false) {               // 第二層【  ?對應(if) 】
				System.out.println("A");
			} else {                   // 第二層【  :對應(else) 】
				System.out.println("B"); // 最終執行這裡！
			}
		} else {                       // 第一層【  :對應(else) 】
			System.out.println("C"); //如果將第一層條件改成 false ，答案就會是 "C"。
		}
		
		// --- 麥當勞點餐 ---店員問你兩個問題：1.要升級漢堡套餐嗎? 2.套餐飲料無糖綠茶要加大嗎?
		// 邏輯：[要升級漢堡套餐嗎?] ? ([套餐綠茶要加大嗎?] ? "A大杯綠茶" : "B中杯綠茶") : "C單點漢堡"
		// 
		// 1. 第一層條件 (設定true = 我要升級漢堡套餐)
		//		    -> 恭喜！你進入了套餐的選擇區，"單點漢堡" (C) 直接出局。
		// 
		// 2. 第二層條件 (設定false = 我飲料不要加大)
		//		    -> 你選了 false (不加大)。
		//		    -> 所以 "大杯綠茶" (A) 出局，最後你拿到的是 "中杯綠茶" (B)。
		// 結論：第一層的 true 只是讓我「有資格」去選 A 或 B ，去做飲料的選擇
		//		       但最後是 A 還是 B，得看第二層的條件結果(true OR false)決定。
	}
}
