package day07;

public class MethodTest {
	
	
	// public static void �Լ���(){
	// }
	
	public static void printName(int cnt, String name) { // �Ű����� �Ķ���� ���� �μ� argument....
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("���α׷� ������");
		
		// Ŭ������.�Լ���() : ex) Integer.parseInt();
		MethodTest.printName(2,"���");
		MethodTest.printName(3,"��ö��");
		MethodTest.printName(4,"�迵��");
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("�̸�");
//			
//		}	
		
	}
}
