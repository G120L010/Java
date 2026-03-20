package demo;

public class Dog extends Animal implements Swimmer {
	
	public void 呼吸() {
		System.out.println("用肺呼吸");
	}
	public void 叫() {
		System.out.println("旺");
	}
	@Override 
	public void swim() {
		System.out.println("狗爬式");
		
	}
	
	
}
