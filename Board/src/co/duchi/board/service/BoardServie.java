package co.duchi.board.service;

import java.util.List;

import co.duchi.board.vo.BoardVO;

public interface BoardServie {
	List<BoardVO> BoardSelectList(); 
	BoardVO BoardSelect(BoardVO vo);
	int BoardWrite(BoardVO vo);
	int BoardDelete(BoardVO vo);
}
