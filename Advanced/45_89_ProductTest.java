package demo2;

public class ProductTest {

	public static void main(String[] args) {
		
		Product z1= new Product();
		z1.setId(1);
		z1.setName("香蕉");
		Product z2= new Product();
		z2.setId(1);
		z2.setName("香蕉");
		System.out.println(z1.equals(z2));

	}

}
