package co.yedam.api;

class Apple implements Cloneable {
	int price;

	Apple(int price) {
		this.price = price;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		Apple ap = (Apple) obj;
		return this.price == ap.price;
	}
}

public class objectExample {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.equals(new Object()));

		Apple ap1 = new Apple(1000);
		Apple ap2 = new Apple(1000);

		try {
			Apple ap3 = (Apple) ap1.clone();
			System.out.println("ap3 값: " + ap3.price);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(ap1.equals(ap2));
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
	
}
