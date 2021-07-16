package co.duchi.board.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.duchi.board.service.BoardServie;
import co.duchi.board.serviceImpl.BoardServiceImpl;
import co.duchi.board.vo.BoardVO;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	private BoardServie dao = new BoardServiceImpl();

	private void menuTitle() {
		BoardSelectList();
		System.out.println("<< 게시판 프로젝트 >>");
		System.out.println("| 1. 글    조회  |");
		System.out.println("| 2. 글    쓰기  |");
		System.out.println("| 3. 글    삭제  |");
		System.out.println("| 4. 시스템 종료  |");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("작업 번호를 선택하세요 >> ");

	}

	private void mainMenu() {
		int jobNo;
		boolean b = false;

		do {
			menuTitle();
			switch (jobNo = sc.nextInt()) {
			case 1:
				boardSelect();
				break;
			case 2:
				boardWrite();
				break;
			case 3:
				boardDelete();
				break;
			case 4:
				b = true;
				System.out.println("프로그램이 종료되었습니다.");
				break;

			}
		} while (!b);

	}

	private void BoardSelectList() {
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = dao.BoardSelectList();
		for (BoardVO board : boards) {
			System.out.println(board.toString());
		}
		
	}

	private void boardDelete() {
		BoardVO vo = new BoardVO();
		System.out.println("삭제할 boardID를 입력하세요.");
		vo.setBoardId(sc.next());

		int n = dao.BoardDelete(vo);

		if (n != 0) {
			System.out.println("정상적으로 삭제 되었습니다.");
		} else {
			System.out.println("삭제 실패.");
		}
	}

	private void boardWrite() {
		BoardVO vo = new BoardVO();
		System.out.println("추가할 boardID를 입력하세요.");
		vo.setBoardId(sc.next());
		sc.nextLine();
		System.out.println("작가를 입력하세요.");
		vo.setWriter(sc.nextLine());
		System.out.println("제목을 입력하세요.");
		vo.setTitle(sc.nextLine());
		System.out.println("내용을 입력하세요.");
		vo.setSubject(sc.nextLine());

		int n = dao.BoardWrite(vo);

		if (n != 0) {
			System.out.println("정상적으로 추가되었습니다.");
		} else {
			System.out.println("추가 실패.");
		}
	}

	private void boardSelect() {
		BoardVO vo = new BoardVO();
		System.out.println("검색할 boardID를 입력하세요.");
		vo.setBoardId(sc.next());
		sc.nextLine();

		vo = dao.BoardSelect(vo);
		System.out.println(vo.getSubject());
	}

	public void run() {
		mainMenu();
		sc.close();
	}
	
}
