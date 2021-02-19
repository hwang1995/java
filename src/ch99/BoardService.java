package ch99;

import java.util.Arrays;

public class BoardService {
	// 필드 선언
	String[][] boards;
	int count = 0;
	
	// 생성자
	public BoardService(int rows, int columns) {
		boards = new String[rows][columns];
	}
	
	// 메서드
	// getNewBoardNo() -> 게시판의 생성시에 번호를 가져오기 위한 메서드
	int getNewBoardNo() {
		return ++count;
	}
	
	// void showList() -> 게시판의 목록을 보여주기 위한 메서드
	void showList() {
		// 게시판 상단의 번호, 제목, 내용, 글쓴이 조회수 보여주기
		System.out.println("------------------------------------------------------------------------------------");
		System.out.print("번호" + "\t");
		System.out.print("제목" + "\t\t\t\t");
		System.out.print("내용" + "\t\t\t\t");
		System.out.print("글쓴이" + "\t");
		System.out.print("조회수" + "\t\n");
		System.out.println("------------------------------------------------------------------------------------");
		
		for(int i =0; i < boards.length; i++) {
			if(boards[i][0] != null) {
				System.out.print(boards[i][0] + "\t");
				System.out.print(boards[i][1] + "\t\t\t\t");
				System.out.print(boards[i][2] + "\t\t\t\t");
				System.out.print(boards[i][3] + "\t");
				System.out.print(boards[i][4] + "\t");
				System.out.println();
			}
		}
	}

	// void create(title, content, writer) -> 게시판의 게시물을 저장하기 위한 메서드
	void create(String title, 
				String content,
				String writer) {
		String[] board = {
				String.valueOf(getNewBoardNo()),
				title,
				content,
				writer,
				String.valueOf("0") // 조회수는 0이니까
		};
		for(int i=0; i < boards.length; i++) {
			if(boards[i][0] == null) {
				boards[i] = board;
				System.out.println(Arrays.toString(board));
				break;
			}
			
		}
		
	}
	
	// String[] read(boardNo) -> 게시판의 게시물을 읽기 위한 메서드 + 조회수 올리기
	String[] read(int boardNo) {
		String[] result = null;
		String strBoardNo = String.valueOf(boardNo);
		for(int i =0; i < 100; i++) {
			if(boards[i][0] != null) {
				if(boards[i][0].equals(strBoardNo)) {
					result = boards[i];
					// 조회수 올리기
					int hitCountUppend = Integer.parseInt(boards[i][4]) + 1;
					boards[i][4] = String.valueOf(hitCountUppend);
					break;
				}
			}
		}
		
		return result;
	}
	
	// void update(int boardNo) -> 게시판의 게시물을 업데이트 하기 위한 메서드
	void update(int boardNo) {
		
	}
	

}
