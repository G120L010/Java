package demo4;

import java.util.HashSet;
import java.util.Set;
// import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TreeSet：自然排序
		// new TreeSet();
		// HashSet：雜湊表、紅黑樹的排序，效能較高
		Set set = new HashSet();// 打完這行直接Ctrl + Shift + O，可直接選擇引入功能
		int i = 1;
		set.add("boy");
		set.add("Dog");
		set.add("Cat");
		set.add(i);// 這裡的i已經不是"八大基本資料型別"
		System.out.println("1.結果：" + set);

		System.out.println("2.找不到：" + set.contains("Boy"));
		System.out.println("3.有找到：" + set.contains("boy"));

		set.remove("boy");
		System.out.println("boy被移除：" + set);

		System.out.println("資料長度(有幾筆)：" + set.size());

		System.out.println("為空嗎？：" + set.isEmpty());// (is是不是)(Empty為空？)

		set.clear();
		System.out.println("清除clear：" + set);

		System.out.println("為空嗎？：" + set.isEmpty());// (is是不是)(Empty為空？)
	}

}
