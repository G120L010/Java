package demo4;

import java.util.HashSet;
import java.util.Set;

public class MyGenericStr {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>(); 以前泛型的寫法
		Set<String> set = new HashSet<String>();// 泛型
		set.add("boy");
		set.add("Dog");
		set.add("Cat");
		System.out.println(set);
		for (Object boject : set) {
			System.out.println(boject);
		}
	}

}
