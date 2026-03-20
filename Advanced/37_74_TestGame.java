package demo;

public class Test {

	public static void main(String[] args) {
		Animal x = Game.getAnimal();
		if (x instanceof Duck) {
			Duck d = (Duck) x;
			d.下蛋();
			System.out.println("是鴨子");
		} else if (x instanceof Dog) {
			Dog d = (Dog) x;
			d.叫();
			System.out.println("是狗");
		} else if (x instanceof Fish fish) {
			fish.swim();
			System.out.println("是魚");
		}

	}

}
