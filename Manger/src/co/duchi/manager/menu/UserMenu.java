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
		System.out.println("==================");
		System.out.println("=== 사용자 메뉴 ===");
		
	}
	
	private void userMenu(MemberVO vo) {
		System.out.println(vo.getName() + "님 환영합니다.");
		title();
		boardList();
		
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
