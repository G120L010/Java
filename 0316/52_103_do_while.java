package helloworld;

public class do_while {

	public static void main(String[] args) {
		//輸入(沒有)
		int total = 0;//輸出
		int i = 101;//暫時儲存的當前值
		
		do {
			total += i;
			System.out.println("i=" + i);
			System.out.println("total=" + total);
			i++;
		} while (i <= 100);
		System.out.println(total);
		//while-->前測迴圈(先進行測試在執行)
		//do-while-->後測試迴圈(先執行再進行測試)
	}

}
