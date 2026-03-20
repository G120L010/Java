package demo;

public class MyInterface { //類別名稱是深藍色
	
	public static Swimmer getSwimmer() {
		return new Dog();
	}
	
	public static void main(String[] args) {
		Swimmer s=MyInterface.getSwimmer();
		s.swim();
		

	}

}
