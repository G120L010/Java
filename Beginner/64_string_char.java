package helloworld;

import javax.swing.JOptionPane;

public class Module7 {

	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "A";
		String s3 = JOptionPane.showInputDialog("A");
		System.out.println(s1.equals(s3));
		// equals方法會將字串中的字元一一進行數值比對，完全相同時才會回傳true。
//		==      比較記憶體位置
//		equals  比較字串內容
	}
}
