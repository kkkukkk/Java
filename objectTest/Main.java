package objectTest;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(2, "ȫ�浿");
		Student s3 = new Student(1, "ȫ�浿");
		
		System.out.println(s1.equals(s3));
		
		
		// println() �� ����� �� ��ȣ �ȿ� Ŭ���� Ÿ���� ��ü�� �ִٸ�
		// toString()�� ���� �� ���̴�
		// toString()�� Object Ŭ������ ���ǵǾ��ְ�, �⺻������
		// ��Ű����.Ŭ������@�ؽ��ڵ� �� ���ǵǾ� �ִ�
		// ���� ������� �� ���� ���ϴ� ������� ����ϰ� �ʹٸ�
		// toString()�� �������̵� �ϸ� �ȴ�
		
//		System.out.println(num1.toString());
		System.out.println(s1.toString());
		System.out.println(s3);
		
		
		
		
		
		
		
		
		
	}
}
