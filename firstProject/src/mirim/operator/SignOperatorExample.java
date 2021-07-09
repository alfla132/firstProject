package mirim.operator;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);

		short s = 100;
//		short result3 = -s; //컴파일에러
		//부호연산자를 이용할 시 산출 타입이 int타입이 되기 때문에 short는 에러가 남.
		int result3 = -s;
		System.out.println("result3: " + result3);
		
	}
}
