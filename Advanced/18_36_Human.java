package advanced;

public class Human {

	// 建立屬性
	double height;
	double weight;

	// 一般方法（實例方法）
	public double getBMI() { // 計算 BMI 的方法（需要物件才能呼叫）
		// BMI 計算公式：體重 / 身高²
		double bmi = weight / Math.pow(height, 2); // Math.pow(x, y) 代表 x 的 y 次方
		return bmi; // 回傳計算結果
	}
	// 靜態方法（類別方法）：不能使用屬性
	// 課本19_38
	public static double getBMI2(double weight, double height) {
		// 不需要建立物件，可以直接用類別名稱呼叫
		// BMI 計算公式：體重 / 身高²
		double bmi = weight / Math.pow(height, 2);
		return bmi; // 回傳計算結果
	}

}
