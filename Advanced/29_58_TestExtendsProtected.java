package advanced;

public class TestExtendsProtected {

	public static void main(String[] args) {
		HumanExtends h = new HumanExtends();
		h.setName("人");
		System.out.println(h.getName());
		h.eat();

		h.name2 = "猴子";// 跨package無法存取
		System.out.println(h.name2);

	}

}
