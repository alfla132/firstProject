package co.yedam.pilates;

public class Main {
	public static void main(String[] args) {
		pilatesApp app = pilatesApp.getInstance();
		app.main();

		pilatesApp app2 = new pilatesApp();
		app2.main();

		System.out.println(app == app2);
	}
}
