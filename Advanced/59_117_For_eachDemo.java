package demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class For_eachDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {// 疊代器有沒有下一筆資料
			Object next = iterator.next();// 拿到下一筆資料
			                            // 將游標指到下一筆資料
			System.out.println(next);// 印出
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (Object o : list) {
			System.out.println(o);
		}

	}

}
