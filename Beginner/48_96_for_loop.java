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
		// 經典老牌：for
		// for(初始值;條件;步進值)
		
		// 條件：true=>做，false=>不做
		// 步進值：每次迴圈的改變量

		// 經典老牌：while
		// while(條件)
		// 條件：true=>做，false=>不做

		
		//經典老牌：do-while
		//do{ 必做一次
		
		// } while(條件);
		// 條件：true=>做，false=>不做
	}

}
