package advanced;

public class HumanTest {

	public static void main(String[] args) {
		Human h = new Human();
		h.height=1.75;
		h.weight=50;
		double bmi = h.getBMI();
		System.out.println(bmi);
	}

}
