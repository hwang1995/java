package ch06.exam08;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		BoardService bs = new BoardService(100, 5);
		bs.create("제목1", "내용1", "작성자1", 0);
		bs.create("제목2", "내용2", "작성자2", 0);
//		bs.showList();
		String[] board = bs.read(2);
		for(String value : board) {
			System.out.print(value + "\t");
		}
	}

}
