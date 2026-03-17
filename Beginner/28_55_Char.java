package helloworld;

public class Char {

	public static void main(String[] args) {
		// \r = 歸位 (carriage return)
		// 會把游標移到同一行的最前面
		// 在某些環境會覆蓋前面的文字
		// 執行結果可能因作業系統不同而不同
		// 在 Windows 終端機中效果較明顯
		// 注意：如果終端機支援，可能會看到 World 覆蓋 Hello
		// 這是因為 \r 會將游標移回行首
		System.out.println("Hello\rWorld");

		// 宣告一個 char 字元
		// '\'' = 單引號字元
		// 因為單引號在字元中有特殊用途
		// 所以要使用跳脫字元 \ 來表示
		char c = '\'';
		System.out.println(c);

		// \' = 單引號跳脫字元
		// \" = 雙引號跳脫字元
		// 因為字串是用(單)雙引號包起來
		// 如果字串中要出現(單)雙引號，就必須加 \
		System.out.println("Hello \'Sky\" World");

		// \n = 換行 (newline)
		// 會直接換到下一行
		// \n 是跨平台常用換行符號
		System.out.println("Hello\nWorld");

		// \\ 代表顯示一個反斜線 \
		// 因為 \ 在字串中是特殊符號
		// 所以必須用 \\ 表示
		System.out.println("Hello\\Sky\\World");

		// \r\n = Windows 系統的換行方式
		// \r = 歸位
		// \n = 換行
		// Windows 記事本常使用 \r\n 作為換行
		System.out.println("Hello\r\nWorld");

		// \t = Tab（定位字元）
		// 會產生固定間距
		// 常用於對齊輸出
		System.out.println("A\tB\tC");

		// 利用 \t 可以讓資料呈現成類似表格格式
		System.out.println("AA\tBB\tCC");
		System.out.println("AAA\tBBB\tCCC");

		// Unicode字元平面：\ u + 4位16進位數字，跳脫字元
		System.out.println("\u32C4\u2230\u33E7");
	}
}
