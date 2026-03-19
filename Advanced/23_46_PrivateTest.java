package advanced;

public class PrivateTest {

	public static void main(String[] args) {

		Car car;
		car = new Car();
		//
		car.setBrand("Honda");
		car.setColor("紅色");

		Car[] carArray = new Car[3];
		Car[] carArray2 = { car, new Car(), null };
		carArray[0] = car;
		carArray[1] = new Car();
		//
		carArray[1].setBrand ("Honda");
		carArray[1].setColor ("白色");
	}
}
