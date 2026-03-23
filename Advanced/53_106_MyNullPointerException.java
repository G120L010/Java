package demo;

public class MyNullPointerException {
	public static Fish getF() {
		return Math.random()>0.5? new Fish():null;
	}

	public static void main(String[] args) {
		Fish f = getF();
		if(f!=null) {
			f.呼吸();
		}

	}

}
