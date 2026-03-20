package demo;

public class PolymorphismTest {

	public static void main(String[] args) {
		MyAbstract x = new MyDuckAbstract();//多型的特徵
		x.呼吸();//多型的特徵
	}
}
