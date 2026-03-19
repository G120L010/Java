package advanced;

public class Private { // 類別
	private String brand; // 屬性
	private String color; // 屬性

// 使用 private 封裝後，需透過 getter / setter 存取屬性
// 產生方式（以 Eclipse 為例）：
//1.在{}內空白處右鍵
//2.選Source
//3.generate getters and setters 

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
		// this=>生成物件時=>this表示這個物件本身
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		// this=>生成物件時=>this表示這個物件本身
	}

	public void go() { // method方法
		System.out.println("出發");
	}
}
