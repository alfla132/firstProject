package co.yedam.pilates;

public class Member {
	private int memberId;
	private String membername;
	private String memberphone;
	private String memberbirth;
	private Gender memebergender; // 남/여 men,women

	public Member() {
		super();
		this.memberId = memberId;
		this.membername = membername;
		this.memberphone = memberphone;
		this.memberbirth = memberbirth;
		this.memebergender = memebergender;
	}

	public Member(int memberId, String membername, String memberphone, String memberbirth, Gender memebergender) {
		this.memberId = memberId;
		this.membername = membername;
		this.memberphone = memberphone;
		this.memberbirth = memberbirth;
		this.memebergender = memebergender;
	}

	

	public Member(int memberId, String membername, String memberphone) {
		this.memberId = memberId;
		this.membername = membername;
		this.memberphone = memberphone;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return membername;
	}

	public void setName(String name) {
		this.membername = name;
	}

	public String getMemberphone() {
		return memberphone;
	}

	public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	}

	public String getMemberbirth() {
		return memberbirth;
	}

	public void setMemberbirth(String memberbirth) {
		this.memberbirth = memberbirth;
	}

	public Gender getMemebergender() {
		return memebergender;
	}

	public void setMemebergender(Gender memebergender) {
		this.memebergender = memebergender;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String showInfo() {
		String info = "[회원번호: " + memberId + "회원이름: " + membername + "연락처 " + memberphone + "생년월일: " + memberbirth
				+ "성별: " + memebergender + "]";
		return info;
	}

	public String getInfo() {
		return "회원번호: " + this.memberId + 
				"     회원이름: " + this.membername + 
				"\n연락처: " + this.memberphone + 
				"  생년월일: " + this.memberbirth +
				"\n성별: " + this.memebergender ;
		
	}
	
}
