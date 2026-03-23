package helloworld;

public class for_loop {

	public static void main(String[] args) {
		//輸入(沒有)
		int total = 0;//輸出
		
		for (int i = 1; //=寫法 (int i=1; i<=100; i++)
				i <=100;
				    ++i) {
			total=total+i;
			System.out.println("i="+i);
			System.out.println("total="+total);
		}
		
	}

}
