package co.yedam.abstracts;

public class PrinterExample {
	public static void main(String[] args) {
		Printer printer = null;

		printer = new SamsungPrinter("ML6"); // 추상클래스는 인스턴스를 못만든다
		printer.turnOn();
		printer.turnOff();
		printer.printing();

		printer = new CanonPrinter("Epson");
		printer.turnOn();
		printer.turnOff();
		printer.printing();

	}
}
