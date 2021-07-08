package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample3 {
	public static void main(String[] args) {
		int[] intAry = { 2, 3, 4, 5, 6, 7, 3, 4, 5 };

		for (int i = 0; i < intAry.length; i++) {
			int temp = intAry[i];
			for (int j = i; j < intAry.length; j++) {

			}
		}

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < intAry.length; i++) {
			set.add(intAry[i]); // 중복값을 허용하지 않음.
		}
		int[] newAry = new int[set.size()]; //배열의 크기를 set컬렉션의 크기로 지정.
		Iterator<Integer> iter = set.iterator();
		int i = 0;
		while (iter.hasNext()) {
			newAry[i] = iter.next();
			i++;
		}
		for (int j = 0; j < newAry.length; j++) {
			System.out.println(newAry[j]);
		}

	}

}
