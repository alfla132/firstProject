package co.duchi.manager;

//import java.util.ArrayList;
//import java.util.List;
//
//import co.duchi.manager.member.service.MemberService;
//import co.duchi.manager.member.serviceImpl.MemberServiedImpl;
//import co.duchi.manager.member.vo.MemberVO;
import co.duchi.manager.menu.LoginMenu;

public class MainApp {
	public static void main(String[] args) {
		
//		MemberService memberDao = new MemberServiedImpl();
//		List<MemberVO> members = new ArrayList<MemberVO>();
//		
//		members = memberDao.memberSelectList();
//		for(MemberVO vo : members) {
//			vo.toString();
//		}
		
		LoginMenu menu = new LoginMenu();
		menu.login();
		
		
		
	}
}
