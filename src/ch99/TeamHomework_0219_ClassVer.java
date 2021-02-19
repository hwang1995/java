package ch99;

import java.util.Arrays;
import java.util.Scanner;

public class TeamHomework_0219_ClassVer {

	public static void main(String[] args) {
		// 초기 변수 선언
		boolean run = true;
		BoardService bs = new BoardService(100 ,5);
		
		Scanner scanner = new Scanner(System.in);
		
		// 로직 선언
		while(run) {
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("  1. 목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5. 삭제(Delete) | 6. 종료");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.print("메뉴선택 : ");
			
			String selectedNo = scanner.nextLine();
			
			switch(selectedNo) {
				case "1" : {
					bs.showList();
					break;
				}
				case "2" : {
					System.out.println("------------------------------------------------------------------------------------");
					System.out.print("제목 : ");
					String title = scanner.nextLine();
					System.out.print("내용 : ");
					String content = scanner.nextLine();
					System.out.print("글쓴이 : ");
					String writer = scanner.nextLine();
					
					bs.create(title, content, writer);
					
					break;
				}
				case "3" : {
					System.out.print("번호 : ");
					int boardNo = Integer.parseInt(scanner.nextLine());
					String[] result = bs.read(boardNo);
					if(result != null) {
						System.out.println(Arrays.toString(result));
					} else {
						System.out.println("게시물이 존재하지 않습니다.");
					}
					break;
				}
				case "4" : {
					break;
				}
				case "5" : {
					break;
				}
				case "6" : {
					break;
				}
				default : {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}

	}

}
