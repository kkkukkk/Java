package innerTest;

public class Outer {
	int ov = 10;
	
	class InnerInstance{ // �ν��Ͻ�Ŭ����
		int iiv = 20;
		
	}
	
	static class InnerStatic{ // ����ƽ Ŭ����
		int isv = 30;
	}
	
	public void f() {
		class InnerLocal{ // ����Ŭ����
			int ilv = 40;
		}
		// ���� Ŭ������ f() �ȿ��� �ۿ� ����� ���Ѵ�.
		InnerLocal il = new InnerLocal();
		System.out.println(il.ilv);
	}
	
	
	
}



class Student{
	
}