package ch15.exam06;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {
		/**
		 * 왜 Set으로 객체를 안받고 TreeSet으로 받았는가?
		 * 왜냐면 Set 객체로 받게되면 Set 인터페이스에 정의되어 있는 것만 사용 가능
		 * TreeSet으로 하면 Set 객체 기능에 특수 기능이 붙어있다.
		 */
		TreeMap<String, String> map = new TreeMap<>();
		map.put("s1", "박길순");
		map.put("s4", "감자바");
		map.put("s2", "홍길동");
		map.put("s3", "개발자");
		map.put("s5", "디자이너");
		
		Set<String> keys = map.keySet();
		for(String item : keys) {
			System.out.println(item + " : " + map.get(item));
		}
		
		NavigableSet<String> nset = map.descendingKeySet();
		System.out.println();
		
		for(String item : nset) {
			System.out.println(item + " : " + map.get(item));
		}
		
		System.out.println();
		
		Map<String, String> sMap = map.subMap("s3", true, "s5", true);
		keys = sMap.keySet();
		for(String item : keys) {
			System.out.println(item + " : " + map.get(item));
		}
		
		
	}

}
