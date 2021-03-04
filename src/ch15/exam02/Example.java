package ch15.exam02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {
		List<Board> list = new LinkedList<>();
		
		list.add(new Board(1, "hello"));
		list.add(new Board(2, "what"));
		list.add(new Board(3, "hello what"));
		
		System.out.println(list.size());
		
		for(Board b : list) {
			System.out.println(b.getBno() + " : " + b.getTitle());
		}

		
		System.out.println();
	
		

	}

}
