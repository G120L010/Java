package advanced;

public class Human {
	// 建立屬性
	double height;
	double weight;

	// 建立方法
	public double getBMI() {
		double bmi = weight / Math.pow(height, 2);
		return bmi;
	}

	// 靜態方法
	public static double getBMI2(double weight, double height) {
		double bmi = weight / Math.pow(height, 2);
		return bmi;
	}

}
