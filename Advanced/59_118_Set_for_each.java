package demo4;

import java.util.HashSet;
import java.util.Set;

public class Set_for_each {

	public static void main(String[] args) {
		Set set = new HashSet();// 打完這行直接Ctrl + Shift + O，可直接選擇引入功能
		set.add("boy");
		set.add("Dog");
		set.add("Cat");
		for (Object boject : set) {
			System.out.println(boject);
		}
	}

}
