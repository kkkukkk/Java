package day08;

public class MethodTest {
	public static int add(int a, int b) {
		System.out.println("�ȳ��ϼ���");
		return a+b;
	}
	
	// return Ÿ���� return ���� �ִ� ���� Ÿ���� �ǹ��Ѵ�
	// �� �޼ҵ��� return Ÿ����?

	public static void main(String[] args) {
		System.out.println(MethodTest.add(1,2) / 2.0);
		// �޼ҵ忡 return Ÿ���� �����Ѵٸ�
		// �ش� �޼ҵ� ���(ȣ��)�� ����� return ������ �����Ѵ�
		int num = MethodTest.add(1, 10);
		System.out.println(num);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
