package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Apple {
	String group;
	int price;

	Apple(String group, int price) {
		this.group = group;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return this.group.hashCode() + this.price; // 동일한종류, 동일한가격..
	}

	@Override
	public boolean equals(Object obj) {
		Apple other = (Apple) obj;
		return this.group.equals(other.group) && this.price == other.price; // super.equals(obj)
	}
}

public class HashSetExample2 {
	public static void main(String[] args) {
		// Set : 중복된 값을 허용하지 않음.
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("부사", 2000));
		set.add(new Apple("부사", 1700));
		set.add(new Apple("부사", 1500));
		set.add(new Apple("아오리", 1000));

		Iterator<Apple> iter = set.iterator();
		while (iter.hasNext()) {
			Apple app = iter.next();
			System.out.println("종류: " + app.group + ", 가격: " + app.price);
		}

	}
}
