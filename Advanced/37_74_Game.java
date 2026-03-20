package demo;

public class Game {

	public static Animal getAnimal() {
		int random = (int) (Math.random() * 100) + 1;
		if (random < 33) {
			return new Fish();
		} else if (random < 66) {
			return new Dog();
		} else {
			return new Duck();
		}
	}
}
