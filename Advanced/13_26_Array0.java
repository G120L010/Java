package advanced;

public class Array0 {

	public static void main(String[] args) {

		Car car;
		car = new Car();
		car.brand = "TOYOTA";
		car.color = "黑色";

		Car[] carArray = new Car[3];
		Car[] carArray2 = { car, new Car(), null };
		carArray[0] = car;
		carArray[1] = new Car();
		carArray[1].brand = "Honda";
		carArray[1].color = "白色";
		carArray[2] = new Car();
		carArray[2].brand = "BMW";
		carArray[2].color = "灰色";
	}
}
