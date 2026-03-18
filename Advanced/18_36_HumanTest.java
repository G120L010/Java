package advanced; // 宣告套件名稱為 advanced

public class HumanTest { // 定義一個測試用的類別 HumanTest

	public static void main(String[] args) {

		Human h = new Human(); // 建立一個 Human 類別的物件 h

		h.height = 1.75; // 設定 h 的身高
		h.weight = 50;   // 設定 h 的體重

		double bmi = h.getBMI(); // 呼叫物件方法 getBMI() 計算 BMI
		System.out.println(bmi); // 印出 BMI 結果

		// 靜態方法的呼叫（不需要建立物件）
		// 課本：20_39
		double bmi2 = Human.getBMI2(50, 1.75); // 使用類別名稱直接呼叫靜態方法，傳入體重與身高
		System.out.println(bmi2); // 印出第二種方式計算的 BMI
	}

}
