package ch06.exam08;

import java.util.Arrays;

public class BoardService {
	// Field
	String[][] boards;
	int count = 0;
	// Constructor
	
	BoardService(int rows, int columns) {
		boards = new String[rows][columns];
	}
	
	// Method
	int getNewBno() {
		return ++count;
	}
	
	void create( String title, String content, String writer, int hitCount) {
		String[] board = {
				String.valueOf(getNewBno()), 
				title, 
				content, 
				writer, 
				String.valueOf(hitCount)
		};
		for(int i =0; i < boards.length; i++) {
			if(boards[i][0] == null) {
				boards[i] = board;
				break;
			}
			
		}
	}
	
	String[] read(int bno) {
		String[] result = null;
		String strBno = String.valueOf(bno);
		for(int i =0; i < 100; i++) {
			if(boards[i][0] != null) {
				if(boards[i][0].equals(strBno)) {
					result = boards[i];
					break;
				}
			} 
		
		}
		
		return result;
			
		
	}
	
	void showList() {
		for(int i =0; i < 100; i++) {
			if(boards[i][0] != null) {
				for(int k=0; k < 5; k++) {
					System.out.print(boards[i][k] + "\t");
				}
				System.out.println();
			}
			
			
		}
		
	}
	
}
