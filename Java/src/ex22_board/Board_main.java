package ex22_board;
import java.util.*;
public class Board_main {
	
	static String[] menus = {"글쓰기","수정","답변달기","글삭제","조회","페이지 선정","종료"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO_seq dao = new BoardDAO_seq();

		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
			case 2:
				update(sc, dao);
				break;
			case 3:
				reply(sc, dao);
				break;
			case 4:
				delete(sc, dao);
				break;
			case 5:
				selectAll(dao);
				break;
			case 6:
				selectPage(sc, dao);
				break;
			case 7:
				sc.close();
				return;
			}
		} while (true);
	}
	

	private static int menuselect(Scanner sc) {
		
		int i=0;
		System.out.println("===================================");
		for (String m : menus) {
			System.out.println(++i + "." + m);
		}
		
		System.out.println("===================================");
		System.out.print("메뉴를 선택하세요>");
		return inputNumber(sc,1,menus.length);
	}
	
	private static int inputNumber(Scanner sc, int start, int end) {
		int input = 0;
		while (true)
			try {
				input = Integer.parseInt(sc.nextLine());
				if ((input <= end && input >= start || start==0 && end==0)) {
					break;
				} else {
					System.out.print(start + "~" + end + "사이의 숫자를 입력하세요>");
				}
			} catch (NumberFormatException e) {
				System.out.print("숫자로 입력하세요>");
			}
		return input;
	}
	
	private static int inputNumber(Scanner sc) {
		return inputNumber(sc, 0, 0);
	}
	
	private static void insert(Scanner sc, BoardDAO_seq dao) {
		Board board = new Board();
		System.out.print("작성자>");
		board.setBoard_name(sc.nextLine());
		
		System.out.print("비밀번호>");
		board.setBoard_pass(sc.nextLine());
		
		System.out.print("제목>");
		board.setBoard_subject(sc.nextLine());
		
		System.out.print("글 내용>");
		board.setBoard_content(sc.nextLine());
		
		if(dao.boardInsert(board)==1) {
			System.out.println("글이 작성되었습니다.");
		} else {
			System.out.println("오류가 발생했습니다.");
		}
	}
	
	private static void printTitle() {
		System.out.printf("%s\t%s\t\t%s\t\t\t%s\t\t\t%s\t%s\t%s\t%s\n", 
				"글번호", "작성자","제목","내용","ref","lev","seq","date");
	}
	
	private static void selectAll(BoardDAO_seq dao) {
		//1-페이지(page)
		//10-페이지 당 목록의 수 (limit)
		List<Board> list = dao.getBoardlist(1, 10);
		if (list.isEmpty()) {
			System.out.println("테이블에 데이터가 없습니다.");
		} else {
			printTitle();
			for (Board b : list) {
				System.out.println(b.toString());
			}
		}
	}
	
	private static void update(Scanner sc, BoardDAO_seq dao) {
		System.out.print("수정할 글 번호를 입력하세요>");
		int num = inputNumber(sc);
		
		Board board = select(dao,num);
		
		if (board != null) {
			System.out.println();
			System.out.print("수정 후 제목>");
			board.setBoard_subject(sc.nextLine());
			
			System.out.print("수정 후 글 내용>");
			board.setBoard_content(sc.nextLine());
			
			System.out.print("비밀번호>");
			if (board.getBoard_pass().equals(sc.nextLine())) {
				if(dao.boardModify(board)==1) {
					System.out.println("수정에 성공했습니다.");
				} else {
					System.out.println("수정에 실패했습니다.");
				}
			}
			else
				System.out.println("비밀번호가 다릅니다");
		}
	}
	
	private static Board select(BoardDAO_seq dao, int num) {
		Board board = dao.getDetail(num);
		if (board != null)
			System.out.print(board.toString());
		else
			System.out.println("해당 글이 존재하지 않습니다.");
		return board;
	}
	
	private static void reply(Scanner sc, BoardDAO_seq dao) {
		System.out.print("답변을 달 글 번호를 입력하세요>");
		int num = inputNumber(sc);
		
		Board board = select(dao, num);
		
		if (board != null) {
			System.out.println();
			System.out.print("글쓴이>");
			board.setBoard_name(sc.nextLine());
			System.out.print("제목>");
			board.setBoard_subject(sc.nextLine());
			System.out.print("글 내용>");
			board.setBoard_content(sc.nextLine());			
			System.out.print("비밀번호>");
			board.setBoard_pass(sc.nextLine());
			if (dao.boardReply(board) == 0)
				System.out.println("답변 달기 실패");
			else
				System.out.println("답변 달기 성공");
		}
	}
	
	private static void delete(Scanner sc, BoardDAO_seq dao) {
		System.out.print("삭제할 글 번호를 입력하세요>");
		int num = inputNumber(sc);
		Board board = select(dao,num);
		
		if (board !=null)
			System.out.println();
			System.out.print("비밀번호를 입력하세요>");
			String pass = sc.nextLine();
			if (board.getBoard_pass().equals(pass)) {
				int count = dao.boardDelete(board);
				System.out.println(count+"개 삭제되었습니다.");
			} else {
				System.out.println("비밀번호가 다릅니다.");
			}
	}
	
	private static void selectPage(Scanner sc, BoardDAO_seq dao) {
//		int listcount = dao.count();
//		System.out.println(dao.count());
//		if (listcount > 0) {
//			System.out.print("한 페이지에 보여줄 목록을 입력하세요(1~10)>");
//			int limit = inputNumber(sc,1,10);
//			int maxpage = (listcount - 1 + limit) / limit;
//			System.out.println("선택할 페이지를 입력하세요(1~"+maxpage+")>");
//			int page = sc.nextInt();
//			List<Board> arrs = dao.getBoardlist(page, limit);
//			
//			printTitle();
//			for (Board b : arrs) {
//				System.out.println(b.toString());
//			}
		int listcount = dao.count();
		
		if(listcount > 0) {
		System.out.print("한 페이지에 보여줄 목록을 입력하세요(1~10)>");
		int limit = inputNumber(sc,1,10);
		int maxpage = (listcount - 1) / limit + 1;
		// listcount-1 해주지 않으면 listcount=10, limit=5일 때 페이지가 3으로 계산된다
		System.out.println("선택할 페이지를 입력하세요(1~"+maxpage+")>");
		
		int page = inputNumber(sc, 1, maxpage);
		List<Board> arrs = dao.getBoardlist(page, limit);
		
		System.out.println("글의 총 갯수 : " + listcount);
		printTitle();
		for (Board b : arrs)
			System.out.println(b);
		} else {
			System.out.println("테이블에 데이터가 없습니다.");
		}
		
	}
	
	

}
