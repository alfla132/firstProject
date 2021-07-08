package co.yedam.generic;

public class Box<T> {
	private T obj; //모든 유형의 클래스들을 사용할 수 있음.

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
