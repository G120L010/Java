package advanced;

public class ClassHuman {
	private int height;
	private double weight;
	
	// 使用 
	// 產生方式（以 Eclipse 為例）：
	//1.在{}內空白處右鍵
	//2.選Source
	//3.generate coustrauctor using fields
	//4.對著淺藍色文字"屬性"右鍵，
	//5.選Refactor
	//6.Encapsulated field
	public ClassHuman(int height, double weight) {
		super();
		this.setHeight(height);
		this.setWeight(weight);
	}

//	// 最好要寫預設建構子，就算沒寫，系統會自動給予該類別一個
//	public ClassHuman() {
//		setHeight(175);
//		setWeight(60);
//	}
//
//	// 建構子
//	public ClassHuman(int height, double weight) {
//		setHeight(height);
//		setWeight(weight);
//	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height > 100 && height < 200) {
			this.height = height;
		} else {
			System.out.println("高度錯誤");
			this.height = 150;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
