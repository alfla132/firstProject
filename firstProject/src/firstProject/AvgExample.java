package firstProject;

public class AvgExample {
	public static void main(String[] args) {
		// ����, ����, ���� 0 ~ 100
		// ����: 85, ����: 88, ����: 83
		// �հ�, ���
		// �л��̸� : 
		// ȫ�浿�� �����հ�� 256, ����� 85.333... �Դϴ�.
		int kor = 85;
		int mat = 88;
		int eng = 83;
		int sum = kor + mat + eng;
		System.out.println("�հ�: " + sum);
		
		double avg = sum / 3.0;
				System.out.println("���: " + avg);
				
				String name = "�̸�";
				System.out.println("�л��̸��� " + name + "�Դϴ�");
				System.out.println(name + "�� �����հ��" + sum + ", �����" + avg + "�Դϴ�.");
				
			String name1 = "������";
			String name2 = "�̸���";
			String name3 = "����";
			System.out.println(name2 + " ���� �ִ� " + name1+ "�� " + name3 + "�Դϴ�.");
	}

}
