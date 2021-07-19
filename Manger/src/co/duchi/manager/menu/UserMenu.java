package co.duchi.manager.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.duchi.manager.board.service.BoardService;
import co.duchi.manager.board.serviceImpl.BoardServiceImpl;
import co.duchi.manager.board.vo.BoardVO;
import co.duchi.manager.member.service.MemberService;
import co.duchi.manager.member.serviceImpl.MemberServiedImpl;
import co.duchi.manager.member.vo.MemberVO;

public class UserMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberService memDao = new MemberServiedImpl(); //멤버 정보 수정
	private BoardService boDao = new BoardServiceImpl(); // 게시글 
	
	private void title() {
		System.out.println("=== 사용자 메뉴 ===");
		System.out.println("================================================================");
		System.out.println("------------------------<< 사용자 메뉴 >>--------------------------");
		System.out.println("  1.나의 정보 수정 | 2.게시글 보기 | 3.게시글 작성 | 4.게시글 수정 | 5.종료");
		System.out.println("================================================================");
		System.out.println("원하는 작업 번호를 선택하세요 >> ");
	}
	
	private void userMenu(MemberVO vo) { //이부분 구현
		System.out.println(vo.getName() + "님 환영합니다.");
		boardList();
		boolean b = false;
		do {
			title(); // 주메뉴 출력
			int choice;
			switch (choice = sc.nextInt()) {
			case 1:
				userInfoUpdate();
				break;
			case 2:
				boardSelectList();
				break;
			case 3:
				boardInsert();
				break;
			case 4:
				boardUpadte(vo.getId());
				break;
			case 5:
				b = true;
				System.out.println("작업을 종료합니다.");
				break;
			}
		} while (!b);
		
	}
	
	private void boardUpadte(String id) {
		// TODO 게시글 수정
		BoardVO vo = new BoardVO();
		System.out.println("게시글 번호를 입력하세요.");
		String boardId = sc.next(); sc.nextLine();		
		vo.setBoardId(boardId);
		vo = boDao.boardSelect(vo); //아이디에 맞는 글을 선택한다
		if(vo.getWriter().equals(id)) {
			vo = new BoardVO();
			System.out.println("수정하실 내용을 입력하세요.");
			vo.setSubject(sc.nextLine()); 
			vo.setWriter(id);
			vo.setBoardId(boardId);
			int n = boDao.boardUpdate(vo);
			if(n != 0) {
				System.out.println("정상적으로 수정되었습니다.");
			} else {
				System.out.println("글 수정이 실패했습니다.");
			}
		} else {
			System.out.println("본인의 글만 수정 가능합니다.");
			vo.toString();
		}
		
	}

	private void boardInsert() {
		// TODO 게시글 작성
		BoardVO vo = new BoardVO();
		System.out.println("글 번호를 입력하세요.");
		vo.setBoardId(sc.next()); sc.nextLine();
		System.out.println("글 제목을 입력하세요.");
		vo.setTitle(sc.nextLine()); 
		System.out.println("글 내용을 입력하세요.");
		vo.setSubject(sc.nextLine()); 	
		System.out.println("작성자를 입력하세요.");
		vo.setWriter(sc.next()); 
		
		int n = boDao.boardInsert(vo);
		if(n != 0) {
			System.out.println("정상적으로 입력되었습니다.");
		} else {
			System.out.println("입력이 실패했습니다.");
		}
	}

	private void boardSelectList() {
		// TODO 게시글 보기
		System.out.println("=========================< 2.게시글 보기 >==========================");
		List<BoardVO> list = new ArrayList<BoardVO>();
		list = boDao.boardSelectList();
		for(BoardVO vo : list) {
			vo.toString();
		}
	}

	private void userInfoUpdate() {
		// TODO Auto-주소와 전화번호만 수정가능
		MemberVO vo = new MemberVO();
		System.out.println("수정하실 회원 id를 입력하세요.");
		vo.setId(sc.next()); sc.nextLine();
		System.out.println("수정하실 주소를 입력하세요.");
		vo.setAddress(sc.nextLine());
		System.out.println("수정하실 전화번호를 입력하세요.");
		vo.setTel(sc.next());
		
		int n = memDao.memberUpdate(vo);
		if(n != 0) {
			System.out.println("정상적으로 수정되었습니다.");
		} else {
			System.out.println("수정 실패했습니다.");
		}
		
	}

	private void boardList() {
		// TODO 게시판 목록 보기
		List<BoardVO> list = new ArrayList<BoardVO>();
		list = boDao.boardSelectList();
		for(BoardVO vo : list) {
			vo.toString();
		}
	}

	public void run(MemberVO vo) {
		userMenu(vo);
	}
}
