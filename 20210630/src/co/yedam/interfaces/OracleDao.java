package co.yedam.interfaces;

public class OracleDao implements Dao {
	//오라클 DBMS를 사용한 CRUD 작업. (create read update delete)
	
	
	@Override
	public void insert() {
		System.out.println("오라클DB 입력처리.");
	}

	@Override
	public void update() {
		System.out.println("오라클DB 수정처리.");
	}

	@Override
	public void delete() {
		System.out.println("오라클DB 삭제처리.");
	}

}
