package staticTest;

public class Person {
	// static : �ش� Ŭ������ ��� ��ü(�ν��Ͻ�)���� ���� �����ϰ� �Ѵ�
	static String country = "KOREA";// ���, �������, Ŭ��������
	String name;// ���, �������, �ν��Ͻ�����
	
	public static void f() { // ����ƽ�޼ҵ�
		// ��� �ν��Ͻ����� �����ϰ� �����ϴ� �޼ҵ�
		System.out.println("����ƽ �޼ҵ�");
//		System.out.println(this.name);
		// ����ƽ �޼ҵ�� ��� �ν��Ͻ��� ���� �����ϰ� �����ؾ��ϱ� ������
		// �ν��Ͻ����� �޶����� �ν��Ͻ� ������ ����� �Ұ����ϴ�		
		System.out.println(Person.country);
		// �ν��Ͻ����� �޶����� �ʴ� Ŭ���� ������ ����� �����ϴ�
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
