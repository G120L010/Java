package advanced;

public class ObjectTest {

	public static void main(String[] args) {

		ObjectTest o1 = new ObjectTest();
		// 建立一個新的物件，假設記憶體位址是 0x100
		// o1 變數存放的是 0x100

		ObjectTest o2 = new ObjectTest();
		// 再建立另一個新的物件，假設記憶體位址是 0x200
		// o2 變數存放的是 0x200

		ObjectTest o3 = o1;
		// o3 指向和 o1 相同的物件，所以 o3 也存放 0x100

		System.out.println(o1 == o2);
		// 比較 o1 和 o2 的位址：0x100 vs 0x200 → false

		System.out.println(o2 == o3);
		// 比較 o2 和 o3 的位址：0x200 vs 0x100 → false

		System.out.println(o1 == o3);
		// 比較 o1 和 o3 的位址：0x100 vs 0x100 → true

		// 整數物件：在-128~127區間，範圍內：true，範圍外：false
		// Object o4 = 127;
		// Object o5 = 127;
		// Object o4 = 129;
		// Object o5 = 129;		
		// System.out.println(o4 == o5);
	}
}
