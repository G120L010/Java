package helloworld;

public class Math {

	public static void main(String[] args) {
		// + 加法運算
		// 100 + 3 = 103
		System.out.println(100 + 3);

		// - 減法運算
		// 100 - 3 = 97
		System.out.println(100 - 3);

		// * 乘法運算
		// 100 * 3 = 300
		System.out.println(100 * 3);

		// / 除法運算
		// 如果兩個都是「整數(int)」，會做整數除法
		// 整數除法會把小數直接捨去（不會四捨五入）
		// 所以 100 / 3 = 33
		System.out.println(100 / 3);
		// 如果想得到小數結果，必須使用小數(double)
		// 例如：100.0 / 3 或 100 / 3.0
		// 這樣才會得到 33.3333...
		System.out.println(100.0 / 3);

		// % 取餘數運算（mod）
		// 100 除以 3 的餘數是 1
		System.out.println(100 % 3);
	}
}
