package co.duchi.prj;

import java.util.ArrayList;
import java.util.List;

import co.duchi.prj.service.MemberService;
import co.duchi.prj.serviceImpl.MemberServiceImpl;
import co.duchi.prj.vo.MemberVO;

public class MainApp {
	public static void main(String[] args) {
		MemberService dao = new MemberServiceImpl();
//		List<MemberVO> list = new ArrayList<MemberVO>();
//
//		list = dao.memberSelectList();
		MemberVO vo = new MemberVO();
		vo.setId("1234");
		
		vo = dao.memberSelect(vo);
		
		
//			System.out.print(vo.getId());
//			System.out.print(vo.getPassword());
//			System.out.print(vo.getName());
//			System.out.print(vo.getAddress());
//			System.out.print(vo.getTel());
//			System.out.println(vo.getAge());
			System.out.println(vo.toString());
	}

}
