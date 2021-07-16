package co.duchi.manager.member.service;

import java.util.List;

import co.duchi.manager.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList(); //전체회원 목록
	MemberVO memberSelect(MemberVO vo); // 회원 조회
	MemberVO loginCheck(MemberVO vo); // 로그인 체크
	int memberInsert(MemberVO vo); // 회원추가
	int memberDelete(MemberVO vo); // 회원추가
	int memberUpdate(MemberVO vo); // 회원추가
}
