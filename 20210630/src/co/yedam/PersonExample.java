package co.yedam;

public class PersonExample {
	public static void main(String[] args) {

		Person p1 = new Person(); // 이름,나이,키,혈액형
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setHeight(188.0); // p1.height = 188.0;
		p1.setBloodType("O");

		Person p2 = new Person();
		p2.setName("김길동");
		p2.setAge(21);
		p2.setHeight(160.3);
		p2.setBloodType("A");

		Person p3 = new Person();
		p3.setName("홍미림");
		p3.setAge(27);
		p3.setHeight(163.4);
		p3.setBloodType("B");

		Person[] persons = { p1, p2, p3 };
		// 새로운 인스턴스 (사람) 선언: 여러분의 정보를 담아서 p3 만들어보세요.

		for (int i = 0; i < persons.length; i++) {
			// 혈액형이 A인 사람만 조회되도록
			if (persons[i].getAge() >= 25) {
//				persons[i].showInfo();
				System.out.println(persons[i].getInfo());
			}
			
		}

//		System.out.println(p1.age + "," + p1.name + "," + p1.height + "," + p1.bloodType + "형");

	}
}
