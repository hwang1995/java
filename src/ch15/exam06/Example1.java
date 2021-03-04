package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		/**
		 * 왜 Set으로 객체를 안받고 TreeSet으로 받았는가?
		 * 왜냐면 Set 객체로 받게되면 Set 인터페이스에 정의되어 있는 것만 사용 가능
		 * TreeSet으로 하면 Set 객체 기능에 특수 기능이 붙어있다.
		 */
		TreeSet<String> set = new TreeSet<>();
		set.add("박길순");
		set.add("감자바");

		set.add("방돌이");
		set.add("홍길동");
		
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		NavigableSet<String> nset = set.descendingSet();
		for(String item : nset) {
			System.out.println(item);
		}
		System.out.println();
		NavigableSet<String> sset = set.subSet("가", false, "방돌이", true);
		for(String item : sset) {
			System.out.println(item);
		}
		
		

	}

}
