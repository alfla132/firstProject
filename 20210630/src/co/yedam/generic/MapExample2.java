package co.yedam.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "최예원");
		map.put(102, "최유리");
		map.put(103, "홍미림");

		
		
		Set<Entry<Integer, String>> set = map.entrySet(); // 키, 값 => Set 컬렉션에 저장.
		Iterator<Entry<Integer, String>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<Integer, String> ent = iter.next();
			Integer key = ent.getKey();
			String val = ent.getValue();
			System.out.println("key: " + key + ", value: " + val);

		}

	}
}

//
//
