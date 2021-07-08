package co.friend.access;

import java.util.List;

import co.friend.model.Friend;

// FriendAccess(인터페이스) 구현객체.
// Database 에 저장하는 용도.
public class FriendDB implements FriendAccess {

	@Override
	public void insert(Friend friend) {
		
	}

	@Override
	public void update(Friend friend) {
		
	}

	@Override
	public void delete(String name) {
		
	}

	@Override
	public List<Friend> selectAll() {
		return null;
	}

	@Override
	public Friend selectOne(String name) {
		return null;
	}

	@Override
	public Friend findTel(String tel) {
		return null;
	}


}
