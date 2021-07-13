package co.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int eScore;
	int mScore;

	public Student(String name, int eScore, int mScore) {
		super();
		this.name = name;
		this.eScore = eScore;
		this.mScore = mScore;
	}

	public String getName() {
		return name;
	}

	public int geteScore() {
		return eScore;
	}

	public int getmScore() {
		return mScore;
	}

}

public class FunctionExample2 {// 매개값 있음, 반환값 있음.
	static List<Student> list = Arrays.asList(new Student("Hong", 80, 90), //
			new Student("Park", 85, 95));

	public static void printString(Function<Student, String> func) {
		for (Student student : list)
			System.out.println(func.apply(student));
	}

	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static void main(String[] args) {
		printString((Student t) -> {
			return t.getName();
		});

		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student t) {
				return t.geteScore();
			}
		});

	}

}
