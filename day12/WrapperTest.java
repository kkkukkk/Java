package day12;

public class WrapperTest {
	public static void main(String[] args) {
		Integer num1 = new Integer(10); // ��ü
		int num2 = 10; // ����
		int num3 = 10;
		Integer num4 = new Integer(10);
		System.out.println(num1);
		System.out.println(num2);
		// == �����ڴ� �����ϴ� �ּҸ� ���Ѵ�(��ü�� ���� ������)
		System.out.println(num2 == num3);
		System.out.println(num1 == num4);
		// equals() : ��ü �ӿ� �ִ� ������ ���Ѵ�
		System.out.println(num1.equals(num4));
		
	}
}
