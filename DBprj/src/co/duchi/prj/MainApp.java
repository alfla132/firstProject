package co.duchi.prj;

import java.util.ArrayList;
import java.util.List;

import co.duchi.prj.member.service.MemberService;
import co.duchi.prj.member.serviceImpl.MemberServiceImpl;
import co.duchi.prj.member.vo.MemberVO;

public class MainApp {
	public static void main(String[] args) {
		// db 연결
		MemberService dao = new MemberServiceImpl(); // db 연결을 위한 객체를 초기화
		List<MemberVO> list = new ArrayList<MemberVO>(); //dao 객체로부터 넘어온 리스트 담기
		
		list = dao.memberSelectList();
		for(MemberVO member : list) {
			member.toString();
		}
	}
}
