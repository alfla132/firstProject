package co.yedam.exercise;

import co.yedam.pilates.Gender;

public class PartTimeJobExample {
	public static void main(String[] args) {

		PartTimeJob p1 = new PartTimeJob();
		p1.setParttimernum(1001);
		p1.setPartnername("김신영");
		p1.setPartnerphone("01012345678");
		p1.setPartnergender(Gender.MEN);
		System.out.println(p1.getParttimernum());

		PartTimeJob p2 = new PartTimeJob(101, "Hong", "01012345678", Gender.MEN);
		System.out.println(p2.getParttimernum());

		PartTimeJob p3 = new PartTimeJob(102, "Rim", "01055555555", Gender.WOMEN);
		System.out.println(p3.getParttimernum());

		PartTimeJob[] partTimeJobs = new PartTimeJob[5];
		partTimeJobs[0] = p1;
		partTimeJobs[1] = p2;
		partTimeJobs[2] = p3;
		partTimeJobs[3] = null;
		partTimeJobs[4] = null;

		for (int i = 0; i < partTimeJobs.length; i++) {
			if (partTimeJobs[i] != null) {
				System.out.println(partTimeJobs[i].getParttimernum() + "," + 
			partTimeJobs[i].getPartnername());
			}
		}

	}

}

