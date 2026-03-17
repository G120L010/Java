package helloworld;

public class Math1 {

	public static void main(String[] args) {
		// 優先順序（由小到大）:運算時會自動轉型為較大的型別（型別提升）
		// byte → short → int → long → float → double
		// __________________________________________
		// int + int
		// 兩個都是整數，結果仍然是 int
		int a0 = 100;
		int b0 = 3;
		Object c0 = a0 + b0;
		System.out.println(c0.getClass().getSimpleName()); // Integer

		// int + double
		// 有 double 參與運算，結果會自動提升為 double
		int a1 = 100;
		double b1 = 3.3;
		Object c1 = a1 + b1;
		System.out.println(c1.getClass().getSimpleName()); // Double

		// float + double
		// double 精度較高，結果會變成 double
		float a2 = 100f;
		double b2 = 3.3;
		Object c2 = a2 + b2;
		System.out.println(c2.getClass().getSimpleName()); // Double

		// short + byte
		// 注意：short、byte 運算時會先轉成 int
		// 所以結果是 int
		short a3 = 100;
		byte b3 = 127;
		Object c3 = a3 + b3;
		System.out.println(c3.getClass().getSimpleName()); // Integer

		// long + float
		// float 的型別優先順序比 long 高
		long a4 = 100;
		float b4 = 3f;
		Object c4 = a4 + b4;
		System.out.println(c4.getClass().getSimpleName()); // Float
	}
}
