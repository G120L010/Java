package helloworld;

public class Bit_shift_operator { // 位元位移運算符

	public static void main(String[] args) {
		int i = 0b1000000; // 二進位表示，等於 64

		// --- 情況 1：右移 >> ---
		// 特色：往右移一格，相當於「除以 2」。
		// 64 >> 1 = 32
		System.out.println(i >> 1); // 印出 32
		System.out.println(Integer.toBinaryString(i >> 1)); // 印出 "100000" (二進位)

		// --- 情況 2：右移超過範圍 ---
		// Int 是 32 位元，右移 32 格等於沒移動。
		System.out.println(Integer.toBinaryString(i >> 32)); // 還是 "1000000"

		// --- 情況 3：左移 << ---
		// 特色：往左移一格，相當於「乘以 2」。
		// 64 << 1 = 128
		System.out.println(i << 1); // 印出 128
		System.out.println(Integer.toBinaryString(i << 1)); // 印出 "10000000" (二進位)

		// --- 情況 4：左移超過範圍 ---
		// 同樣因為 Int 只有 32 位元，左移 32 格等於沒移動。
		System.out.println(Integer.toBinaryString(i << 32)); // 還是 "1000000"

		// ---------------------------------------------------------

		// --- 情況 5：負數右移 >> ---
		// 特色：右移時，負數會「補 1」在左邊，維持負號。
		int g = -64;
		System.out.println(g >> 1); // 印出 -32

		// --- 情況 6：無號右移 >>> ---
		// 特色：不管正負，左邊都補 0。
		// 所以負數會變成超大的正數。
		System.out.println(g >>> 1); // 印出 2147483616

		// >>：右移，保留符號 → 「除以 2，保留正負」
		// 正數：64 → 32，相當於除以 2。
		// 負數：-64 → -32，因為右移時左邊補 1，負號保留。

		// <<：左移，補 0 → 「乘以 2」
		// 64 → 128，相當於乘以 2。
		// 左移時右邊補 0，數字變大。

		// >>>：右移，補 0 → 「無視正負，強制當正數」
		// 原本是負數 -64，但無號右移時左邊補 0，結果變成超大的正數。
	}
}
