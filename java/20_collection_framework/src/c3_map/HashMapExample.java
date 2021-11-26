package c3_map;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("최기근", 100);
		map.put("심현석", 59);
		map.put("양은정", 99);
		map.put("박종혁", 80);
		System.out.println(map);
		map.put("심현석", 85);
		System.out.println(map);
		int score = map.get("최기근");
		System.out.println(score);
		map.remove("심현석");
		System.out.println(map);
		
		System.out.println(map.containsKey("심현석"));
		System.out.println(map.containsValue(80));
		
		System.out.println("===================================");
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entry = entrySet.iterator();
		
		while(entry.hasNext()) {
			Map.Entry<String, Integer> ent = entry.next();
			System.out.println("key : " + ent.getKey());
			System.out.println("value : " + ent.getValue());
			if(ent.getKey().equals("박종혁")) {
				entry.remove();
			}
		}
		System.out.println(map);
		System.out.println("===================================");
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyItr = keySet.iterator();
		
		while(keyItr.hasNext()) {
			String key = keyItr.next();
			int value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
//			if(key.equals("최기근")) {
//				map.remove(key);
//			}
		}
		System.out.println(map);
		
		for(String s : keySet) {
			System.out.println("key : " + s);
		}
	}

}		