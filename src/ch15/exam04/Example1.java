package ch15.exam04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		
		// Map 객체 생성
		Map<String, String> map = new HashMap<>();
		
		// Entry에 저장
		map.put("s1", "홍길동");
		map.put("s2", "감자바");
		map.put("s3", "개발자");
		
		// 키의 값 가져오기
//		String s1 = map.get("s1");
//		System.out.println(s1);
		
		// 키의 값을 반복적으로 가져오기 1
		Set<Entry<String, String>> set = map.entrySet();
		for(Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
		
		// 키의 값을 반복적으로 가져오기 2
		Set<String> set1 = map.keySet();
		for(String key : set1) {
			System.out.println(map.get(key));
		}
		
		// 삭제
		map.remove("s1");
		map.clear();
		System.out.println(map.size());
		
		
		

	}

}
