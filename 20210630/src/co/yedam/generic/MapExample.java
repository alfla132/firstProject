package co.yedam.generic;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("오혜지", 80);
		map.put("은영빈", 81);
		map.put("임효인", 82);
		map.put("은영빈", 83);

		Integer val = map.get("오혜지");
		System.out.println(val);

		Set<String> keys = map.keySet(); // map컬렉션에 있는 키값만 set컬렉션으로 가져온다.
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next(); // 키값을 set컬렉션에서 가져와서...
			Integer value = map.get(key); // 키를 활용해서 value를 읽어오겠음.
			System.out.println("key: " + key + ", val: " + value);
		}

	}
}
