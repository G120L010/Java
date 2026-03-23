package demo4;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set set = new HashSet();// 打完這行直接Ctrl + Shift + O，可直接選擇引入功能
		int i = 1;
		set.add("boy");
		set.add("Dog");
		set.add("Cat");
		set.add(i);//這裡的i已經不是"八大基本資料型別"
		System.out.println(set);

		System.out.println(set.contains("Boy"));
		System.out.println(set.contains("boy"));
		set.remove("boy");
		System.out.println(set);

	}

}
