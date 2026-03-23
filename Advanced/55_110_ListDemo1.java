package demo4;

import java.util.ArrayList;
import java.util.List;


public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		String s ="apple";
		list.add(s);
		list.add(s);
		
		list.add("Banana");
		list.add("Cat");
		list.add("Apple");
		
		System.out.println(list);
		list.remove(s);
		
		System.out.println(list);
		System.out.println(list.get(3));

	}

}
