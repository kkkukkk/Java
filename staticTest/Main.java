package staticTest;

import accessTest.Test;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.country = "JAPAN";
		System.out.println(p1.country);
		System.out.println(p2.country);
		System.out.println(Person.country);
		// static ������ �ν��Ͻ����� �޶����� �ʱ� ������ ���� 
		// �ν��Ͻ��̸�.������ ���� ����� �ʿ䰡 ����
		// Ŭ������.������ ���� ����ϴ°��� �ٶ����ϴ�
		
		
		p1.f();
		p2.f();
		Person.f(); // ����ƽ �޼ҵ�� �ν��Ͻ����� �������� �޶����� �ʱ� ������	
					// Ŭ������.�޼ҵ��()���� ����ϴ� ���� �ٶ����ϴ�
		
		// ���ڿ��� int�� �ٲ��ִ� �޼ҵ�
		Integer.parseInt("10");
		String msg = "�ȳ�";
		msg.equals("�ȳ�");
		
		
		
		// access test
		Test t = new Test();
//		t.pri = 10; public�� �ٸ� ��Ű�� �ٸ� Ŭ�������� ������ �����ϴ�
//		t.def = 10;
//		t.pro = 10;
		t.pub = 10;
		
//		t.prif(); public�� �ٸ� ��Ű�� �ٸ� Ŭ�������� ������ �����ϴ�
//		t.deff();
//		t.prof();
		t.pubf();

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
