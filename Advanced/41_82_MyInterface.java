package demo;

public class MyInterface { //類別名稱是深藍色
	
	//推薦寫法
	public static Swimmer getSwimmer() {
		return new Duck();
	}
	
	public static void main(String[] args) {
		Swimmer s=MyInterface.getSwimmer();
		s.swim();
		
		
		System.out.println(Swimmer.i);
		

	}

}
