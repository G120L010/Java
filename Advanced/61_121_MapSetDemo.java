package demo4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import demo.Dog;
import demo.Duck;
import demo.Fish;

public class MapSetDemo {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("Dog", new Dog());// key-value："Dog"是key，而new Dog()是value。
		map.put("Duck", new Duck());
		map.put("Fish", new Fish());

		System.out.println(map);
		Set keySet = map.keySet();
		for (Object object : keySet) {
			System.out.println("key=" + object + ",value=" + map.get(object));
		}
	}

}
