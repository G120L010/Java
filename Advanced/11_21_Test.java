package advanced;

public class Test {

	public static void main(String[] args) {
	    Car car; // 宣告一個 Car 類別的變數 car（目前還沒有指向任何物件）
	    car = new Car(); // 建立一個新的 Car 物件，假設記憶體位址是 0x100
	    car.brand = "Honda"; // 設定 brand 屬性為 "Honda"
	    car.color = "紅色";   // 設定 color 屬性為 "紅色"

		System.out.println(car.brand); //列印brand屬性
		System.out.println(car.color); //列印color屬性
		
	    Car car2; // 宣告另一個 Car 類別的變數 car2
	    car2 = new Car(); // 建立另一個新的 Car 物件，假設記憶體位址是 0x200
	    car2.brand = "Honda"; // 設定 brand 屬性為 "Honda"
	    car2.color = "紅色";   // 設定 color 屬性為 "紅色"

	    // 雖然 car 和 car2 的屬性值都相同，但它們指向的是不同的記憶體位址 (0x100 vs 0x200)
	    // 因此比較參考 (==) 時會得到 false
	    System.out.println(car == car2); // 輸出 false
	}
}
