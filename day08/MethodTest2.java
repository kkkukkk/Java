package day08;

public class MethodTest2 {
//	public static int add(int a, int b) {
//		System.out.println(a+b);
//		return 10;
//	} ����Ÿ�԰��� �����ϴ�
	
//	public static void add(int num1, int num2) {
//		System.out.println(num1+num2);
//	} �Ű����� �̸����� �����ϴ�
	
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	
	//�޼ҵ� �����ε�(overloading)
	//���� �̸��� �޼ҵ������� �Ű������� ������ �ٸ� ���
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	//�Ű������� Ÿ���� �ٸ� ���
	public static void add(double a, int b) {
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {
		
		
		MethodTest2.add(10.5, 20);
		MethodTest2.add(10,20);
		MethodTest2.add(10,20,30);
	}
	
	
}
