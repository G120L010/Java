package helloworld;

public class MySwitch_Case2 {

	public static void main(String[] args) {

		// 使用 enum 的方法 valueOf()，將字串 "mid" 轉換成對應的列舉值 Size.mid
		Size s = Size.valueOf("mid");

		// 使用 switch-case 判斷列舉值
		// 語意：根據 s 的值，選擇對應的 case 執行
		switch (s) {
		case small:
			System.out.println("小杯");
			break;//如果這行沒有，就會同時給出"小杯、中杯"

		case mid:
			System.out.println("中杯");
			break;

		case Large:
			System.out.println("大杯");
			break;

		// default：以上條件都不成立時執行
		default:
			System.out.println("靠杯");
			break;
		}
	}
}

// --- 操作流程 ---
// 1. 先定義 enum Size { small, mid, Large }，表示固定的三種尺寸。
// 2. 使用 Size.valueOf("mid") 將字串轉換成 enum 值 → 得到 Size.mid。
// 3. switch-case 依照 enum 的值進行判斷：
//    - 如果是 Size.small → 輸出「小杯」
//    - 如果是 Size.mid   → 輸出「中杯」
//    - 如果是 Size.Large → 輸出「大杯」
//    - 如果都不符合 → 執行 default，輸出「靠杯」
// 4. 程式只會執行符合的第一個 case，並在 break 後結束判斷。
//    這就是 switch-case 搭配 enum 的「固定值多重選擇」結構。


// --- 程式三大基本結構 ---
// 1. 循序結構 (Sequential Structure)
//    → 程式一行一行依序執行，沒有分支或迴圈
//    → 範例：int a = 10; int b = 20; int c = a + b;
//
// 2. 選擇結構 (Selection Structure)
//    → 根據條件不同，選擇不同的執行路徑
//    → 範例：if-else、switch-case
//
// 3. 迴圈結構 (Loop Structure)
//    → 重複執行某段程式碼，直到條件不成立
//    → 範例：for、while、do-while
//
// --- 套用到 MySwitch_Case2 ---
// Size s = Size.valueOf("mid"); → 屬於循序結構 (單純依序執行)
// switch (s) { ... }            → 屬於選擇結構 (根據 enum 值選擇分支)

