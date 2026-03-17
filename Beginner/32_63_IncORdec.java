package helloworld;

public class IncORdec {

	public static void main(String[] args) {

		// 後置遞增 (a++)
		// a++：先用舊值，再 +1
		int a = 10;
		int x1 = a++; // x1=10, a=11
		System.out.println("先用再加，a++ x1= " + x1); // 輸出 10
		// 流程圖 (列印結果)：a=10 → x1=10 → 列印: x1=10

		// 前置遞增 (++b)
		// ++b：先 +1，再用新值
		int b = 10;
		int x2 = ++b; // b=11, x2=11
		System.out.println("先加再用，++b x2= " + x2); // 輸出 11
		// 流程圖 (列印結果)：b=10 → b=11 → x2=11 → 列印: x2=11

		// 後置遞減 (c--)
		// c--：先用舊值，再 -1
		int c = 10;
		int x3 = c--; // x3=10, c=9
		System.out.println("先用再減，c-- x3= " + x3); // 輸出 10
		// 流程圖 (列印結果)：c=10 → x3=10 → 列印: x3=10

		// 前置遞減 (--d)
		// --d：先 -1，再用新值
		int d = 10;
		int x4 = --d; // d=9, x4=9
		System.out.println("先減再用，--d x4= " + x4); // 輸出 9
		// 流程圖 (列印結果)：d=10 → d=9 → x4=9 → 列印: x4=9
	}
}
