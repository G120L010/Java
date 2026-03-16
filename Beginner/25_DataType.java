package helloworld;

import java.math.BigDecimal;

public class DataType {

	public static void main(String[] args) {

		// ===== 1. 整數型別 =====
		byte b = 127; 					  // byte 範圍：-128 ~ 127
		short s = 32000; 				 // short 範圍：-32768 ~ 32767
		int i = 2147483647;				// int 範圍：-2^31 ~ 2^31-1 (Java 預設整數型別)
		long l = 9223183648000000000L; // long 型別需要加 L

		// ===== 2. 浮點數型別 =====
		float f = 0.1f; // float 必須加 f
		double d = 0.2; // double 是預設小數型別

		// 浮點數計算可能會有誤差
		System.out.println("float + double = " + (f + d));

		// ===== 3. BigDecimal (精確小數計算) =====
		BigDecimal num1 = new BigDecimal("0.1");
		BigDecimal num2 = new BigDecimal("0.2");

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num1 + num2 = " + num1.add(num2));

		// ===== 4. 字元型別 =====
		char c = '大';
		System.out.println("char = " + c);

		// ===== 5. 布林型別 =====
		boolean tr = true;
		boolean fa = false;

		System.out.println("true value = " + tr);
		System.out.println("false value = " + fa);
//		byte   → 很小的整數
//		short  → 小整數
//		int    → 預設整數
//		long   → 大整數 (要加 L)
//		float  → 單精度 (要加 f)
//		double → 雙精度 (預設)
//		add()       加
//		subtract()  減
//		multiply()  乘
//		divide()    除
	}
}
