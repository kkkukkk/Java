package day09;

public class Student {
	String name;
	int kor;
	int eng;

	// Ŭ���� �ȿ� �����ڰ� ���� ���� �Ǿ����� �ʴٸ�
	// �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� �߰����ش�
	// �����ڰ� ���� ���ǵǾ��ִٸ� �⺻�����ڸ� �߰������� �ʴ´�
	
	// ���� �⺻ �����ڿ� �ʱ�ȭ ������ ��θ� ����ϰ� �ʹٸ�
	// �����ε��ϸ� �ȴ�
	public Student() {;}
	
	// �ʱ�ȭ ������(�ν��Ͻ� ������ �ʱⰪ�� �־��ִ� ������)
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	// �ν��Ͻ� ���� name, kor, eng�� ���� �������ִ� �޼ҵ� �����
	public void setVariables(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void show() {
		System.out.println("---�л�����---");
		System.out.println("�̸� : " + name);
		System.out.println("�������� : " + this.kor);
		System.out.println("�������� : " + this.eng);
		System.out.println("-------------");
	}

}
