package clear;

public class MyStaticBlock {

	private int a;
	private int b;
	private int c;
	private int d;

	static {
		System.out.println("歡迎光臨");
	}
	{
		System.out.println("歡迎光臨2");
	}

	//預設建構子
	public MyStaticBlock() {

	}

	public MyStaticBlock(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public MyStaticBlock(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public MyStaticBlock(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public MyStaticBlock(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}
