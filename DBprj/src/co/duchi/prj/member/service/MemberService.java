package co.duchi.prj.member.service;

import java.util.List;

import co.duchi.prj.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList(); //전체 회원 정보 가져오기
	MemberVO memberSelect(MemberVO vo); //한명 데이터 조회
	int memberInsert(MemberVO vo); //한명 추가
	int memberUpdate(MemberVO vo); //한명 갱신
	int memberDelete(MemberVO vo); //한명 삭제
}
