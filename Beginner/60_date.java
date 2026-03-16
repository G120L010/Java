package helloworld;

import java.sql.Date;

public class ModuleDATE {

	public static void main(String[] args) {

		// 建立目前時間 (java.util.Date)
		java.util.Date d2 = new java.util.Date();

		// 將 util.Date 轉換成 sql.Date
		Date d = new Date(d2.getTime());

		// 印出日期 (只顯示 yyyy-mm-dd)
		System.out.println(d);
	}
}
