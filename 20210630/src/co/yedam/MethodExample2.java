package co.yedam;

public class MethodExample2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(27);
		String name = p1.getName();
		int age = p1.getAge();

		int n1 = p1.getSum(10, 20);
		int n2 = p1.getSum(5, 5);
		int result = p1.getSum(n1, n2);

		System.out.println("결과: " + result);

		// 10~20
		n1 = p1.getFrom10To20();
		System.out.println("10 ~ 20: " + n1);
		
		
		String selfIntroduce = p1.getNameAndAge("홍길동", 27);
		System.out.println(selfIntroduce);
		
		Person newPerson = p1.creatNewPerson("홍미림", 27);
		newPerson.setHeight(163.4);
		newPerson.setBloodType("B");
		System.out.println(newPerson.getInfo());
		
		// 
		Person anotherPerson = p1.anotherNewPerson("이수아", 50, 183.4);
		anotherPerson.setBloodType("O");
		System.out.println(anotherPerson.getInfo());
		
		
		Person theOtherPerson = p1.theOtherNewPerson("이수아", 50, 183.4, "O");
		System.out.println(theOtherPerson.getInfo());
		
		
		
		
	}
}
