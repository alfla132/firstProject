package co.duchi.manager.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.duchi.manager.board.service.BoardService;
import co.duchi.manager.board.serviceImpl.BoardServiceImpl;
import co.duchi.manager.member.service.MemberService;
import co.duchi.manager.member.serviceImpl.MemberServiedImpl;
import co.duchi.manager.member.vo.MemberVO;

public class AdminMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberService memDao = new MemberServiedImpl(); //멤버 정보 수정
	private BoardService boDao = new BoardServiceImpl(); // 게시글 
	
	private void title() {
		System.out.println("==================");
		System.out.println("===관리자 메뉴 ");
		
	}
	
	private void adminMenu(MemberVO vo) {
		System.out.println(vo.getName() + "관리자님 환영합니다.");
		title();
		memberList();
	}
	
	private void memberList() {
		// TODO 멤버목록 가져오기 
		List<MemberVO> list = new ArrayList<MemberVO>();
		list = memDao.memberSelectList();
		for(MemberVO vo : list) {
			vo.toString();
		}
	}

	public void run(MemberVO vo) {
		adminMenu(vo);
	}
}
