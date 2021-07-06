package co.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {
		Dao dao2 = new MysqlDao();

		dao2.insert();
		dao2.update();
		dao2.delete();

		// sqlite, postgreSQL,
		dao2 = new Dao() {
			@Override
			public void insert() {
				System.out.println("postgreSQL 입력처리.");
			}

			@Override
			public void update() {
				System.out.println("postgreSQL 수정처리.");
			}

			@Override
			public void delete() {
				System.out.println("postgreSQL 삭제처리.");
			}

		};

		dao2.insert();
		dao2.update();
		dao2.delete();

//		dao = new MysqlDao();
	}
}