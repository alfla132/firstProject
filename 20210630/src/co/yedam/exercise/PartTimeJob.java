package co.yedam.exercise;

import co.yedam.pilates.Gender;

public class PartTimeJob {
	private int parttimernum;
	private String partnername;
	private String partnerphone;
	private Gender partnergender; // 남/여 men,women
	
	
	public PartTimeJob(int parttimernum, String partnername, String partnerphone, Gender partnergender) {
		this.parttimernum = parttimernum;
		this.partnername = partnername;
		this.partnerphone = partnerphone;
		this.partnergender = partnergender;
	}
	public PartTimeJob() {
		// TODO Auto-generated constructor stub
	}
	public int getParttimernum() {
		return parttimernum;
	}
	public void setParttimernum(int parttimernum) {
		this.parttimernum = parttimernum;
	}
	public String getPartnername() {
		return partnername;
	}
	public void setPartnername(String partnername) {
		this.partnername = partnername;
	}
	public String getPartnerphone() {
		return partnerphone;
	}
	public void setPartnerphone(String partnerphone) {
		this.partnerphone = partnerphone;
	}
	public Gender getPartnergender() {
		return partnergender;
	}
	public void setPartnergender(Gender partnergender) {
		this.partnergender = partnergender;
	}

}
