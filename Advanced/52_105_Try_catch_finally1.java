package demo2;

import javax.swing.JOptionPane;

public class Try_catch_finally1 { //主程式

	public static void main(String[] args) throws OneNumberException {

		try {
			String ageString = JOptionPane.showInputDialog("AGE");
			//// 印出l的資料長度
			System.out.println("\"" + ageString + "\"");
			int l = ageString.length();
			System.out.println(l);
			////
			int age = Integer.valueOf(ageString);

			if (age >= 18) {
				System.out.println("成年");
			} else if (age <= 5) {
				System.out.println("未成年");
			} else {
				System.out.println("其他狀況");
			}

		} catch (Exception e) {
			throw new OneNumberException(e);
//			System.out.println("未知例外");
		} finally {
			System.out.println("必定執行");
		}
		System.out.println("這行還是會執行");
	}

}
