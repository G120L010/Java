package helloworld;

import java.math.BigDecimal;

public class DataType {

	public static void main(String[] args) {
		// 四種整數型別
		byte b = 127; // byte 範圍：-128 ~ 127
		short s = 32767; // short 範圍：-32768 ~ 32767
		int i = 2147483647; // int 範圍：-2^31 ~ 2^31-1 (Java 預設整數型別)
		long l = 9223372036854775807L; // long 型別：最後需要加 L

		// 兩種浮點數型別
		float f = 0.1f; // float 必須字尾加 f
		double d = 0.2; // double 是預設宣告小數型別

		// 浮點數計算會有些許誤差，不適合精密計算
		System.out.println("float+double= " + (f + d));

		// 使用BigDecimal大型十進制物件 (精確的小數計算)
		// 使用字串建立，計算數值加上""，避免浮點數誤差
		// char[] BigDecimal={'0','.','1'}
		BigDecimal num1 = new BigDecimal("0.1");
		BigDecimal num2 = new BigDecimal("0.2");
		// 不是Java八種資料型態的任何一種
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		// 加 add()
		// 減 subtract()
		// 乘 multiply()
		// 除 divide()
		System.out.println("num1+num2= " + num1.add(num2));

		// 字元型別
		char o = '單';
		System.out.println("char= " + o);

		// 布林型別
		boolean tr = true;
		boolean fa = false;
		System.out.println("true value = " + tr);
		System.out.println("false value = " + fa);

		// byte → 很小的整數
		// short → 短整數
		// int → 整數 (預設)
		// long → 長整數 (要加 L)
		// float → 單精度 (要加 f)
		// double → 雙精度 (預設)
		// char → 字元
		// boolean → 布林值 (true/false)
	}
}
