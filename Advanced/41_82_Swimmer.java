package demo;

public interface Swimmer { //介面名稱為亮藍色
	
	 default void swim() {
		System.out.println("不支援此功能");
	}
	
	//新增Interface的java檔
	//而不是Class的java檔
	 
	int i=100;
}
