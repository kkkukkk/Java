package day08;

public class ClassTest {
	public static void main(String[] args) {
		int num = 10;
		// kim : ��ü, �ν��Ͻ�
		// Student() : ������
		Student kim = new Student(); // ��üȭ

		Student hong = new Student();

		hong.name = "ȫ�浿";
		hong.kor = 80;
		hong.eng = 70;

		kim.name = "��ö��";
		kim.eng = 70;
		kim.kor = 80;

		// hong�̶�� ��ü�� ����
		// �ش� ��ü�� ȫ�浿, ���� : 80, ���� : 70 �� �л� ������ �����϶�

//		System.out.println("---�л�����---");
//		System.out.println("�̸� : "+ kim.name);
//		System.out.println("���� : "+ kim.kor);
//		System.out.println("���� : "+ kim.eng);

		// �浿�� �л����� ����ϱ�
		kim.show();
		hong.show();
		
	}
}

class Student {
	// Ŭ���� ���� : �ʵ�
	String name; // ���, ��� ����, �ν��Ͻ� ����
	int kor;// ���, ��� ����, �ν��Ͻ� ����
	int eng;// ���, ��� ����, �ν��Ͻ� ����

	public void show() {// ���, ��� �Լ� == �޼ҵ�
		System.out.println("---�л�����---");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.kor);
		System.out.println("���� : " + this.eng);
	}
}
