package clear;

public class MyTestStaticBlock {
	
	static {
		System.out.println("歡迎光臨Test");
	}

	public static void main(String[] args) {
		MyStaticBlock d = new MyStaticBlock(); 
		MyStaticBlock d1 = new MyStaticBlock(8); 
		MyStaticBlock d2 = new MyStaticBlock(9,10); 
		MyStaticBlock d3 = new MyStaticBlock(1,2,3); 
		MyStaticBlock d4 = new MyStaticBlock(); 
		MyStaticBlock d5 = new MyStaticBlock(); 
		MyStaticBlock d6 = new MyStaticBlock(); 
		MyStaticBlock d7 = new MyStaticBlock(); 

	}

}
