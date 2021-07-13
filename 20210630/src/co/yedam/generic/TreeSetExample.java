package co.yedam.generic;

import java.util.TreeSet;

class Member implements Comparable<Member> {
	int memeberNo;
	String memberName;

	public Member(int memeberNo, String memberName) {
		super();
		this.memeberNo = memeberNo;
		this.memberName = memberName;
	}

	@Override
	public int compareTo(Member o) {
		// a < b < c
//		return this.memeberNo - o.memeberNo; // 3, 5 = -2
		
//		if(this.memeberNo < o.memeberNo)
//			return -1;
//		else if (this.memeberNo == o.memeberNo)
//			return 0;
//		else 
//			return 1;
		if(this.memberName.compareTo(o.memberName) == 0) {
			return this.memeberNo - o.memeberNo;
		}
		return this.memberName.compareTo(o.memberName); // -1, 0, 1
	}

}

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Member> members = new TreeSet<Member>();
		members.add(new Member(1004, "Hong"));
		members.add(new Member(1002, "Choi"));
		members.add(new Member(1003, "Kim"));
		members.add(new Member(1001, "Hong"));
		while(!members.isEmpty()) {
			Member mem = members.pollFirst();
			System.out.println(mem.memeberNo + ", " + mem.memberName);
		}
		
		System.out.println("String.compareTo :" + "Hark".compareTo("Hong"));
		
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10); // Integer, new Integer(10)
		set.add(5);
		set.add(13);

		set.first();
		set.last();

		while (!set.isEmpty()) {
			Integer v = set.pollFirst(); //

//			System.out.println(v);
		}
		System.out.println("end.");
	}
}
