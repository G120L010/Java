package advanced;

public class Null {

	public static void main(String[] args) {
		Car car; // 宣告一個 Car 類型的變數 car（目前還沒有指向任何物件）
		car = new Car(); // 建立一個新的 Car 物件
		car.brand = "Honda"; // 設定 brand 屬性
		car.color = "紅色"; // 設定 color 屬性

		car = null; // 將 car 變數指向 null，不再指向任何物件
					// 原本的 Car 物件 (0x100) 如果沒有其他變數參考，就會等待垃圾回收 (GC)

		System.out.println(car);
		// 輸出 car 的值，因為 car 現在是 null，所以會印出 "null"
	}
}
