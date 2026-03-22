package helloworld;

import java.util.Scanner; // 引用工具

public class InputStream {

	public static void main(String[] args) {

		// 這裡進行輸出的語法去顯示出來
		System.out.println("請輸入"); // 步驟四

		// 打sc然後Alt+/【使用Scanner(掃描器物件) - java.util(工具)】
		// 1.宣告我的變數SC是一種Scanner(掃描器物件)
		// 2.因為後面需要進行賦值，而Scanner是物件，所以會需要"new"
		// 3.而在Scanner()建構子裡面，要放入我們的輸入資料流(System.in)
		// 補充：System：系統，in：輸入流
		// 4.把輸入流委託給掃描器進行處理
		// 5.Scanner獲得了使用System.in的權利，可提取信息
		Scanner sc = new Scanner(System.in); // 步驟一

		// 1.首先呼叫sc為物件本身
		// 2.然後調用.next()這個方法，這個方法為"下一筆資料"，方法說明：會回傳String字串
		// 3.打上;分號為程式碼解為結尾時
		// 4.然後在前面進行字串的宣告，名稱取名str，String str
		// 5.sc.next()取得的資料值，會指派給str這個變數
		String str = sc.next(); // 步驟二
		
		String str1 = sc.nextLine();

		// 然後來觀察str裡面有甚麼東西 被輸入，然後去建立輸出
		System.out.println(str); // 步驟三
	}
	// 建構子速查小筆記：
	// 1. 建構子 (Constructor) 是一種特殊的方法，用來在建立物件時初始化它。
	// 2. 語法：new 類別名稱(參數...)
	// 3. 例如：new Scanner(System.in)
	//	    - Scanner() → 建構子
	//	    - System.in → 傳入的參數，代表鍵盤輸入流
	// 4. 意思：建立一個新的 Scanner 物件，並且讓它使用鍵盤輸入作為資料來源
	
	// --- 學習筆記整理 ---
    // 掌握 Scanner 的使用流程：
    // 建立 Scanner 物件：Scanner sc = new Scanner(System.in);
    // 讀取輸入：String str = sc.next();
    // 輸出結果：System.out.println(str);
    // 這是一個完整的「輸入 → 儲存 → 輸出」流程。

    // 理解建構子 (Constructor) 的概念：
    // Scanner() 就是建構子，用來初始化物件。
    // (System.in) 是建構子的參數，指定輸入來源。
    // new Scanner(System.in) → 建立一個新的 Scanner 物件，並且讓它使用鍵盤輸入。
    // 當看到 new 類別名稱(...)，就是在呼叫建構子來建立物件。
	
	// --- Scanner 常用方法速查表 ---
    // sc.next()     → 讀取「一個字串 token」，遇到空白就停止 (適合單字)
    // sc.nextLine() → 讀取「整行文字」，直到按下 Enter 為止 (適合句子或段落)
    // sc.nextInt()  → 讀取一個整數 (int)
    // sc.nextDouble() → 讀取一個浮點數 (double)
}
