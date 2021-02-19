package ch99;

import java.util.Arrays;
import java.util.Scanner;

public class TeamHomework_0218_1 {

	public static void main(String[] args) {
		// 초기 변수 선언
		boolean run = true;
		String[][] boardArray = new String[100][5];
		
		// mockCode
//		boardArray[0][0] = "1";
//		boardArray[0][1] = "제목 1";
//		boardArray[0][2] = "내용 1";
//		boardArray[0][3] = "글쓴이 1";
//		boardArray[0][4] = "0";
		
		int deletedNo = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		// 로직 선언
		while(run) {
			int count = 0;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5. 삭제(Delete) | 6. 종료");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.print("메뉴선택 : ");
			
			String selectedNo = scanner.nextLine();
			
			
			switch(selectedNo) {
			case "1": {
				
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("번호        제목                내용                글쓴이            조회수           ");
				System.out.println("--------------------------------------------------------------------------------");
				int[] check = new int[100];
				
				for(int i =0; i < boardArray.length; i++) {
					if(boardArray[i][0] == null) {
						System.out.println("i ==========> " + i);
						continue;
						
					}
					int max = 0;
					int index = 0;
					for(int j = 0; j < boardArray.length; j++) {
						if(boardArray[j][0] == null) {
							System.out.println("i inner i ==========> " + i);
							continue;
						}
						int num = Integer.parseInt(boardArray[j][0]);
						if(max <= num && check[j] == 0) {
							System.out.println("max: " + max);
							System.out.println("index : " + index);
							max = num;
							index = j;
							System.out.println("index : " + index);
						}
					}
					System.out.println("i ===========> " + i);
					if(index != -1) {
						System.out.println(Arrays.toString(boardArray[index]));
						check[index] = 1;
					}
				}
			


				
			
//				
//				for(int i =boardArray.length - 1; i >= 0; i--) {
//					if(boardArray[i][0] != null) {
//						
//						break;
//					}
//				}
//				

			
				System.out.println();
				break;
			}
			case "2":
			{
				int insertNo = 0;
				for(int i = 0; i < boardArray.length; i ++) {
					if(boardArray[i][0] == null) {
						insertNo = i;
						break;
					}
				}
				
				// 만약 삭제된 게시물이 있다면?
				if(deletedNo != 0) {
					// 만약 지금의 인덱스보다 삭제된 인덱스가 큰 경우 번호를 삭제된 인덱스에 +1 해준다.
					if(deletedNo > insertNo) {
						boardArray[insertNo][0] = Integer.toString(deletedNo + 1);
						deletedNo++;
					} 
					else { // 만약 지금의 인덱스가 삭제된 인덱스가 크다면 지금의 인덱스를 사용한다.
						boardArray[insertNo][0] = Integer.toString(insertNo + 1);
					}
					
				} else {
					boardArray[insertNo][0] = Integer.toString(insertNo + 1);
				}
				System.out.println("--------------------------------------------------------------------------------");
				System.out.print("제목 : " );
				boardArray[insertNo][1] = scanner.nextLine();
				System.out.print("내용 : " );
				boardArray[insertNo][2] = scanner.nextLine();
				System.out.print("글쓴이 : " );
				boardArray[insertNo][3] = scanner.nextLine();
				boardArray[insertNo][4] = "0";
				
				// 다 끝난 이후에 목록 출력을 한다.
				
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("번호        제목                내용                글쓴이            조회수           ");
				System.out.println("--------------------------------------------------------------------------------");

				for(int i =boardArray.length - 1; i >= 0; i--) {
					if(boardArray[i][0] != null) {
						System.out.println(boardArray[i][0] + "          "  +
										   boardArray[i][1] + "                " +
								           boardArray[i][2] + "                " +
										   boardArray[i][3] + "            " +
								           boardArray[i][4] + "           " 
						);
					}
				}
				System.out.println();
				break;
				
			}
			case "3" : {
				System.out.print("번호 : ");
				int readNo = Integer.parseInt(scanner.nextLine()) -1 ;
				// 게시물 1번을 읽어온다면 처리해야하는 로직
				if(readNo == -1) {
					readNo = 0;
				}
				if(boardArray[readNo][0] == null) {
					System.out.println("없는 게시물입니다. 다시 한번 게시물 번호를 봐주세요.");
				}  else {
					// 읽기를 출력한다. (읽게 된다면 조회수 +1 반영)
					System.out.println("제목 : " + boardArray[readNo][1]);
					System.out.println("내용 : " + boardArray[readNo][2]);
					System.out.println("글쓴이 : " + boardArray[readNo][3]);
					System.out.println("조회수 : " + boardArray[readNo][4]);
					// 조회수 +1 로직
					int readCount = Integer.parseInt(boardArray[readNo][4]) + 1;
					boardArray[readNo][4] = Integer.toString(readCount);
					
					System.out.println();
					
				}
				break;
			}
			case "4" : {
				System.out.print("번호 : ");
				int modifyNo = Integer.parseInt(scanner.nextLine()) - 1;
				if(modifyNo == -1) {
					modifyNo = 0;
				}
				if(boardArray[modifyNo][0] == null) {
					System.out.println("없는 게시물입니다. 다시 한번 게시물 번호를 봐주세요.");
				} else {
					System.out.println("기존 제목  : " + boardArray[modifyNo][1]);
					System.out.print("수정 제목 : ");
					String modifyName = scanner.nextLine();
					
					if(!modifyName.equals("")) {
						boardArray[modifyNo][1] = modifyName;
					}

					System.out.println("기존 내용 : " + boardArray[modifyNo][2]);
					System.out.print("수정 내용 : ");
					String modifyContent = scanner.nextLine();
					if(!modifyContent.equals("")) {
						boardArray[modifyNo][2] = modifyContent;
					} 
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("번호        제목                내용                글쓴이            조회수           ");
					System.out.println("--------------------------------------------------------------------------------");
					for(int i =boardArray.length - 1; i >= 0; i--) {
						if(boardArray[i][0] != null) {
						
							System.out.println(boardArray[i][0] + "          "  +
											   boardArray[i][1] + "                " +
									           boardArray[i][2] + "                " +
											   boardArray[i][3] + "            " +
									           boardArray[i][4] + "           " 
							);
						}
					}
					System.out.println();
					break;
			}
				
			}
			case "5" : {
				System.out.print("번호 : ");
				// 일단 게시물이 null인가?
				int deleteNo = Integer.parseInt(scanner.nextLine());
				boolean flag = false;
				for(int i =0 ; i < boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						if(boardArray[i][0].equals(Integer.toString(deleteNo))) {
							for(int j=0; j < boardArray[i].length; j++) {
								boardArray[i][j] = null;
							}
							flag = false;
							deletedNo = i + 2;
							break;
						}

					} else {
						flag = true;
					}
				}
				if(flag) {
					System.out.println("삭제되지 않았습니다.");
				}else {
					System.out.println("삭제되었습니다.");
					// 다 끝난 이후에 목록 출력을 한다.
//					int max = 0;
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("번호        제목                내용                글쓴이            조회수           ");
					System.out.println("--------------------------------------------------------------------------------");
					for(int i =boardArray.length - 1; i >= 0; i--) {
						if(boardArray[i][0] != null) {
							
							System.out.println(boardArray[i][0] + "          "  +
											   boardArray[i][1] + "                " +
									           boardArray[i][2] + "                " +
											   boardArray[i][3] + "            " +
									           boardArray[i][4] + "           " 
							);
						}
					}
					System.out.println();
				}
				
				break;
				
			}
			case "6" : {
				System.out.println("종료");
				run = false;
				break;
				
			}
			}
			

		}
		

	}

}
