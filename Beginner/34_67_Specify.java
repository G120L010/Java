package helloworld;

public class Specify {

	public static void main(String[] args) {
		// 指定運算子簡寫變化： i=i+1; => i+=i1; => i+=1;
		// 註解說明：這是從「展開式」演變成「複合式」的思考過程

		// 範例寫法1，比較好理解
		int 變數x = 100;
		變數x = 變數x + 3; // 傳統寫法：把 100 拿出來加 3，再存回變數x
		System.out.println(變數x); // 輸出 103

		// 範例寫法2，比較資深
		int 變數y = 100;
		變數y += 3; // 簡寫寫法：變數+3=，變數加完等於 (Add and Assign)
		System.out.println(變數y); // 輸出 103
	}

}
