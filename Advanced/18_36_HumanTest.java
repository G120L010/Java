package advanced;

public class HumanTest {

	public static void main(String[] args) {
		Human h = new Human();
		h.height = 1.75;
		h.weight = 50;
		double bmi = h.getBMI();
		System.out.println(bmi);

		// 靜態方法的呼叫使用，課本：20_39
		double bmi2 = Human.getBMI2(50, 1.75);
		System.out.println(bmi2);
	}

}
