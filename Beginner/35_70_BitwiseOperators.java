package helloworld;

public class BitwiseOperators { // 位元運算(Bitwise Operations)
	public static void main(String[] args) {
		
		// 老師舉例：
		// b1 = 12 (8+4)
		// b2 = 10 (8+2)
		byte b1 = 0b1100;
		byte b2 = 0b1010;

		// 1. AND (&) 及：兩者皆為 1 才是 1 (全真才真)
		// -------------------------
		// b1  位元：  1   1   0   0
		// 面額表  ：  8 | 4 | 2 | 1
		// b2  位元：  1   0   1   0
		// -------------------------
		// 結果位元：  1   0   0   0  => 只剩下 8 元亮燈，印出 8
		System.out.println("AND (&) 結果：" + (b1 & b2));
		System.out.println(Integer.toBinaryString(b1&b2));

		// 2. OR (|) 或：只要有一個 1 就是 1 (有真即真)
		// -------------------------
		// b1  位元：  1   1   0   0
		// 面額表  ：  8 | 4 | 2 | 1
		// b2  位元：  1   0   1   0
		// -------------------------
		// 結果位元：  1   1   1   0  => 8+4+2 亮燈，印出 14
		System.out.println("OR (|) 結果：" + (b1 | b2));
		System.out.println(Integer.toBinaryString(b1|b2));

		// 3. XOR (^) 互斥或：兩者不同才是 1 (有夠反骨)
		// -------------------------
		// b1  位元：  1   1   0   0
		// 面額表  ：  8 | 4 | 2 | 1
		// b2  位元：  1   0   1   0
		// -------------------------
		// 結果位元：  0   1   1   0  => 只有 4+2 亮燈，印出 6
		System.out.println("XOR (^) 結果：" + (b1 ^ b2));
		// 💡：因為最左邊是 0，電腦預設會省略，所以手動補一個 "0" 讓它對齊面額表
		System.out.println("0"+Integer.toBinaryString(b1^b2));
	}
}
