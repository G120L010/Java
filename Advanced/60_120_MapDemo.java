package demo4;

import java.util.HashMap;
import java.util.Map;

import demo.Dog;
import demo.Duck;
import demo.Fish;

public class MapDemo {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("Dog", new Dog());// key-value："Dog"是key，而new Dog()是value。
		map.put("Duck", new Duck());
		map.put("Fish", new Fish());
		map.put("1234", 1234);
		System.out.println(map);
		System.out.println(map.remove("Dog"));
		System.out.println(map);
		System.out.println(map.size());
		map.clear();
		System.out.println(map);
		System.out.println(map.size());

	}

}
