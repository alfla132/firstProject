package referece;

public class PersonExample {
	public static void main(String[] args) {
		Person hmr = new Person(); // 실제 존재를 만드는 것 : 인스턴스화 라고 함 (개체)
		hmr.name = "홍미림";
		hmr.age = 27;
		hmr.height = 163.4;
		hmr.weight = 50;
//		hmr.birth = "19950720"
		
		hmr.sleep();
		hmr.showInfo();
		
		Person bjh = new Person();
		bjh.walk();
		
		
	}
}
