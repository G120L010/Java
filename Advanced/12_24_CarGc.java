package advanced;
//類別：理論上沒有實體，去訂定結構
//物件：架構與行為不會改變

public class Car {			//類別
	public String brand;	//屬性
	public String color;	//屬性
	
	public void go() {		//method方法
		System.out.println("出發");
	}
	@Override
		protected void finalize() throws Throwable {
			System.out.println("物件被回收");
			super.finalize();
		}
}
