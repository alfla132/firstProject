package co.yedam.abstracts;

public class CanonPrinter extends Printer {

	public CanonPrinter(String modelName) {
		super(modelName);
	}
	
	@Override
	public void printing() {
		System.out.println("캐논프린터를 출력합니다.");
	}

}
