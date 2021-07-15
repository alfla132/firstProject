package co.duchi.prj;

import java.util.ArrayList;
import java.util.List;

import co.duchi.prj.app.Menu;
import co.duchi.prj.service.MemberService;
import co.duchi.prj.serviceImpl.MemberServiceImpl;
import co.duchi.prj.vo.MemberVO;

public class MainApp {
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.run();
		
		
		
		
//		MemberService dao = new MemberServiceImpl();
//		List<MemberVO> list = new ArrayList<MemberVO>();
//
//		list = dao.memberSelectList();
//		System.out.println(list);
//		MemberVO vo = new MemberVO();
//		vo.setId("park");
//		vo.setPassword("4321");
//		vo.setName("박차고가자");
//		vo.setAddress("둘리시에 산다는 가수");
//		vo.setTel("010-9999-9999");
//		vo.setAge(21);
//		
//		int n = dao.memberUpdate(vo);
//		if (n != 0) {
//			System.out.println("정상적으로 수정되었습니다.");
//		} else {
//			System.out.println("입력 실패.");
//		}
		
			
//			System.out.print(vo.getId());
//			System.out.print(vo.getPassword());
//			System.out.print(vo.getName());
//			System.out.print(vo.getAddress());
//			System.out.print(vo.getTel());
//			System.out.println(vo.getAge());
//			System.out.println(vo.toString());
	}

}
