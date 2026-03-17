package helloworld;

public class Char {

	public static void main(String[] args) {
		// \r = 回車 (carriage return)
		// 會把游標移到同一行的最前面
		// 在某些環境會覆蓋前面的文字
		System.out.println("Hello\rWorld");

		// 宣告一個 char 字元
		// '\'' = 單引號字元
		// 因為單引號在字元中有特殊用途
		// 所以要使用跳脫字元 \ 來表示
		char c = '\'';
		System.out.println(c);

		// \" = 雙引號跳脫字元
		// 因為字串是用雙引號包起來
		// 如果字串中要出現雙引號，就必須加 \
		System.out.println("Hello \"Sky\" World");

		// \n = 換行 (newline)
		// 會直接換到下一行
		System.out.println("Hello\nWorld");

		// \r\n = Windows 系統的換行方式
		// \r = 回車
		// \n = 換行
		// 常見於 Windows 系統
		System.out.println("Hello\r\nWorld");
	}
}
