package demo4;

import java.util.ArrayList;
import java.util.List;


public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		String s ="apple";
		list.add(s);
		list.add(s);
		System.out.println("1："+list);
		System.out.println("2："+list.size());
		
		list.add("Banana");
		list.add("Cat");
		list.add("Apple");
		
		System.out.println("3："+list);
		
		list.remove(4);			
		System.out.println("4："+list);
		
		int indexOf = list.indexOf("Apple");
		System.out.println("5："+indexOf);
		
		System.out.println("6："+list.get(1));
		
		System.out.println("7："+list);
	
	}

}
