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

public class AdminMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberService memDao = new MemberServiedImpl(); // 멤버 정보 수정
	private BoardService boDao = new BoardServiceImpl(); // 게시글

	private void title() {
		System.out.println("===================================");
		System.out.println("-----------<< 관리자 메뉴 >>----------");
		System.out.println("  1.사용자 관리 | 2.게시판 관리 | 3.종료");
		System.out.println("===================================");
		System.out.println("원하는 작업 번호를 선택하세요 >> ");
	}

	private void subMemberTitle() {
		System.out.println("===============================================================");
		System.out.println("-------------------<< 1.사용자 관리 >>----------------------------");
		System.out.println("  1) 멤버 정보 목록 | 2) 멤버 정보 조회 | 3) 멤버 정보 삭제 | 4) 돌아가기");
		System.out.println("===============================================================");
		System.out.println("원하는 작업 번호를 선택하세요 >> ");
	}

	private void subBoardTitle() {
		System.out.println("===========================================================");
		System.out.println("-------------------<< 2.게시판 관리 >>------------------------");
		System.out.println("  1) 글 목록 | 2) 글 쓰기 | 3) 글 수정 | 4) 글 삭제 | 5) 돌아가기");
		System.out.println("===========================================================");
		System.out.println("원하는 작업 번호를 선택하세요 >> ");
	}

	private void adminMenu(MemberVO vo) { // 이 부분 구현
		System.out.println(vo.getName() + "관리자님 환영합니다.");
		boolean b = false;
		do {
			title(); // 주메뉴 출력
			int choice;
			switch (choice = sc.nextInt()) {
			case 1:
				userManager();
				break;
			case 2:
				boardManager();
				break;
			case 3:
				b = true;
				System.out.println("작업을 종료합니다.");
				break;
			}
		} while (!b);
	}

	private void memberDelete() {
		// TODO 멤버 삭제
		MemberVO member = new MemberVO();
		System.out.println("삭제할 아이디를 입력하세요.");
		member.setId(sc.next());sc.nextLine();
		int n = memDao.memberDelete(member);
		if(n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else { 
			System.out.println("없는 아이디거나, 기타 이유로 삭제되지 않았습니다.");
		}
	}

	private void memberSelect() {
		// TODO 멤버 조회
		MemberVO member = new MemberVO();
		System.out.println("검색할 아이디를 입력하세요.");
		member.setId(sc.next()); sc.nextLine();
		member = memDao.memberSelect(member);
		
		member.toString();
	}

	private void memberSelectList() {
		// TODO 멤버 목록 조회
		System.out.println("=========================< 사용자 목록 >==========================");
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = memDao.memberSelectList();
		for (MemberVO member : members) {
			member.toString();
		}
	}

	private void userManager() {
		// TODO 사용자 관리
		boolean b = false;
		do {
			int chk;
			subMemberTitle(); // 사용자 메뉴 호출
			switch (chk = sc.nextInt()) {
				case 1:
					memberSelectList(); // 멤버목록 조회
					break;
				case 2:
					memberSelect(); // 멤버 조회
					break;
				case 3:
					memberDelete(); // 멤버 삭제
					break;
				case 4:
					b = true;
					System.out.println("목록으로 돌아갑니다.");
					break;
			}
		} while (!b);
	}

	private void boardManager() {
		// TODO 게시판 관리
		boolean b = false;
		do {
			int chk;
			subBoardTitle(); // 게시판 관리 목록
			switch (chk = sc.nextInt()) {
				case 1:
					boardSelectList(); // 글 목록
					break;
				case 2:
					boardInsert(); // 글 쓰기
					break;
				case 3:
					boardUpdate(); // 글 수정
					break;
				case 4:
					boardDelete(); // 글 삭제
					break;
				case 5:
					b = true;
					System.out.println("목록으로 돌아갑니다.");
					break;
			}
		} while (!b);
	}

	private void boardDelete() {
		// TODO 글 삭제
		BoardVO vo = new BoardVO();
		System.out.println("삭제하실 글의 제목을 입력하세요.");
		vo.setBoardId(sc.next()); 
		
		int n = boDao.boardDelete(vo);
		if(n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제 실패했습니다.");
		}
	}

	private void boardUpdate() {
		// TODO 글 수정(내용만)
		BoardVO vo = new BoardVO();
		System.out.println("수정하실 글번호를 입력하세요.");
		vo.setBoardId(sc.next()); sc.nextLine();
		System.out.println("수정하실 내용을 입력하세요.");
		vo.setSubject(sc.nextLine()); 
		
		int n = boDao.boardUpdate(vo);
		if(n != 0) {
			System.out.println("정상적으로 수정되었습니다.");
		} else {
			System.out.println("수정 실패했습니다.");
		}
	}

	private void boardInsert() {
		// TODO 글 쓰기
		BoardVO vo = new BoardVO();
		System.out.println("게시판 아이디를 입력하세요.");
		vo.setBoardId(sc.next()); sc.nextLine();
		System.out.println("게시판 타이틀을 입력하세요.");
		vo.setTitle(sc.nextLine()); 
		System.out.println("내용을 입력하세요.");
		vo.setSubject(sc.nextLine()); 	
		System.out.println("작성자를 입력하세요.");
		vo.setWriter(sc.next()); sc.nextLine();
		
		int n = boDao.boardInsert(vo);
		if(n != 0) {
			System.out.println("정상적으로 입력되었습니다.");
		} else {
			System.out.println("입력이 실패했습니다.");
		}
	}

	private void boardSelectList() {
		// TODO 글 목록 조회
		List<BoardVO> list = new ArrayList<BoardVO>();
		list = boDao.boardSelectList();
		for(BoardVO vo : list) {
			vo.toString();
		}
	}

	public void run(MemberVO vo) {
		adminMenu(vo);
	}
}
