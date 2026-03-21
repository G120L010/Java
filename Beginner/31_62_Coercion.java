package helloworld;
//Co_er_cion，強迫
public class Coercion {
//	當等號左邊的範圍>(大於)右邊的範圍，則不用強制轉型，可直接放值，如：
//	double d = 1;//1是int
//
//	當左邊的數值範圍<(小於)右邊的數值範圍時，則需要強制轉型，強制轉型方式，如：
//	int i = 1;
//	short j = (short)i;
//
//	例外：
//	short、byte直接賦值的時候，可以不用在前方加入型別，如：
//	short s = 1;

	public static void main(String[] args) {

		// 強制轉型（大轉小）
		// long → int 強制轉型
		// 2147483648L 超過 int 最大值
		int i = (int) 2147483648L;
		System.out.println("int i = " + i); // 左 大於 右

		// int → byte 強制轉型
		// byte 範圍 -128 ~ 127
		byte b2 = (byte) i;
		System.out.println("byte b2 = " + b2); // i 的數值超出 byte 可表示範圍
		// 強制轉型流程：
		// 2147483648L → (int) → -2147483648 → (byte) → 0
		// __________________________________________________________________

		// 自動轉型（小轉大）
		// int → long 自動轉型
		int a = 100;
		long l = a; // 不需要寫 (long)
		System.out.println("long L = " + l);

		// 自動轉型流程：
		// 100 (int) → 自動轉成 long → 100L
		// int → double 自動轉型
		int x = 50;
		double d = x; // 不需要寫 (double)
		System.out.println("double D = " + d);

		// 自動轉型流程：
		// 50 (int) → 自動轉成 double → 50.0
	}
}
