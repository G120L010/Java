package helloworld;

public class Module7 {

	public static void main(String[] args) {
		String str = "Java 位元組碼（英語：Java bytecode）是Java虛擬機器執行的一種指令格式。大多數操作碼都是一個位元組長，而有些操作需要參數，導致了有一些多位元組的操作碼。 而且並不是所有可能的256個操作碼都被使用；其中有51個操作碼被保留做將來使用。";
		System.out.println(str.length());
		System.out.println(str.indexOf("Java",14));
		System.out.println(str.substring(43));
		System.out.println(str.substring(43, 45));
//		length()      → 字串長度
//		indexOf()     → 找字位置
//		substring()   → 擷取字串
//		toLowerCase() → 轉小寫
//		toUpperCase() → 轉大寫
//		找字 → indexOf
//		切字 → substring
//		算長度 → length
//		大小寫轉換 → toLowerCase / toUpperCase
		String s="ASDFGzxcvb";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
}
