package demo4;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
//		for(int i=0;;i++){ //無限創資料夾
//		for(int i=0;i<10;i++){ //創10個
//			File file = new File("C:/Java/File/A"+i+".txt");
			
			File file = new File("C:/Java/File/");
//			 System.out.println(file.exists()); //資料夾是否存在
			System.out.println(file.mkdirs()); //建立資料夾
			
			// 只要打這行file.createNewFile();然後選try/catch
			try {
				file.createNewFile();//建立檔案
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println(file.delete());//刪除
		}
//	}
}
