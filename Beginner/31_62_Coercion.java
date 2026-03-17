package helloworld;

public class Coercion {

	public static void main(String[] args) {

		// long → int 強制轉型
		// 2147483648L 超過 int 的最大值（2147483647）
		// 強制轉型時會發生「溢位」，數值會從頭開始算
		int i = (int) 2147483648L;
		System.out.println(i); // 會變成 -2147483648

		// int → byte 強制轉型
		// byte 範圍是 -128 ~ 127
		// 轉型時只保留最後 8 位元（會再次溢位）
		byte b2 = (byte) i;
		System.out.println(b2); // 結果會是 0
		
		// 整個流程：2147483648L → (int) → -2147483648 → (byte) → 0
	}
}
