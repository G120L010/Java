package helloworld;

public class while_51_101 {

	public static void main(String[] args) {
		//輸入(沒有)
		int total = 0;//輸出
		
		int i = 1;//暫時儲存的當前值
		while (i <= 100) {
			total += i;
			System.out.println("i=" + i);
			System.out.println("total=" + total);
			i++;
		}
		System.out.println(total);

	}

}
