package advanced;

public class DemoTest {

	public static void main(String[] args) {
		Demo d=new Demo();
		int i = d.add(9, 9);
		System.out.println(i);
		d.print("在main方法中呼叫");
	}

}
