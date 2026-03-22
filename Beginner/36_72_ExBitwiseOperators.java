package helloworld;

public class ExBitwiseOperators {

	public static void main(String[] args) {

		// --- 情況 1：單個 & (邏輯及) -> 「不短路」 ---
		// 特色：它是老實人，不管左邊是真是假，右邊【一定會執行】。
		int i = 1;
		boolean b = (1 == 2) & (++i > 2);
		// 執行順序解析：
		// 1. 左邊 (1 == 2) 是 false。
		// 2. 因為用 &，所以右邊 (++i > 2) 照樣跑。
		// 3. i 從 1 變成 2。
		System.out.println(b);
		System.out.println("使用 & 時，i 的結果：" + i); // 印出 2

		// ---------------------------------------------------------

		// --- 情況 2：雙個 && (短路及) -> 「會短路」 ---
		// 特色：它是聰明人，只要左邊確定是 false，結果鐵定是 false，
		// 為了省功，右邊會直接【斷電/不執行】。
		int i2 = 1;
		boolean b2 = (1 == 2) && (++i2 > 2);
		// 執行順序解析：
		// 1. 左邊 (1 == 2) 是 false。
		// 2. 因為用 &&，電腦發現結果已經注定是 false 了。
		// 3. 右邊 (++i2 > 2) 被「短路」直接跳過。
		// 4. i2 根本沒被加到，維持原樣。
		
		System.out.println(b2);
		System.out.println("使用 && 時，i2 的結果：" + i2); // 印出 1
	}

}
