package demo4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import demo.Animal;
import demo.Dog;
import demo.Duck;
import demo.Fish;

public class Map_Generic_Demo {

	public static void main(String[] args) {
		Map<String, Animal> map = new HashMap<>();
		map.put("Dog", new Dog());// key-value："Dog"是key，而new Dog()是value。
		map.put("Duck", new Duck());
		map.put("Fish", new Fish());
//		System.out.println(map);

		//EntrySet
		Set<Entry<String, Animal>> entrySet = map.entrySet();
		for (Entry<String, Animal> entry : entrySet) {
			System.out.println("Entry_Key" + entry.getKey() + "Entry_Value" + entry.getValue());
			entry.getValue().呼吸();
		}
		
		
		
//		for (Object object : entrySet) {
//			if (object instanceof Entry entry) {
//				System.out.println("Entry_Key" + entry.getKey() + "Entry_Value" + entry.getValue());
//			}
//		}

		//KeySet
//		Set keySet = map.keySet();
//		for (Object object : keySet) {
//			System.out.println("Key=" + object + ",Value=" + map.get(object));
//		}
	}

}
