package demo2;

import javax.swing.JOptionPane;

public class Try_catch_finally {

	public static void main(String[] args) {

		try {
			String ageString = JOptionPane.showInputDialog("AGE");
			//// 印出l的資料長度
			System.out.println("\""+ageString+"\"");
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

		} catch (NumberFormatException e) {
			e.printStackTrace();// 適合寫進程式碼的日誌當中
//			System.out.println("數值格式有問題");
		} catch (NullPointerException e) {
			e.printStackTrace();
//			System.out.println("沒有輸入資料");
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("未知例外");
		} finally {
			System.out.println("必定執行");
		}
		System.out.println("這行還是會執行");
	}

}
