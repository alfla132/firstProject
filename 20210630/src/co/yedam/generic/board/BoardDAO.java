package co.yedam.generic.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BoardDAO {
	ArrayList<Board> list = new ArrayList<Board>();
	
	public Map<String, String> getBoards() {
		Map<String, String> map = new HashMap<>();
		
		for(Board board : list) {
			map.put(board.getTitle(), board.getContent());
		}
		return map;
	}
	
	public ArrayList<Board> getBoardList() {
		return list;
	}

	public void insertBoard(Board board) {
		list.add(board);
	}
	
	public void updateBoard(String arg1, String arg2) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(arg1)) {
				list.get(i).setContent(arg2); //변경.
				break;
			}
		}
	}

	public void updateBoard(Board board) {
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());
				break;
			}
		}
	}
	
	
	
	
	
	
	
	

}

//
//
//
