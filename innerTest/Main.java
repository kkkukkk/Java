package innerTest;

import interTest.Soldier;

public class Main {
	public static void main(String[] args) {
		//���� Ŭ���� ����ƽ Ŭ���� ��üȭ
		Outer.InnerStatic oi = new Outer.InnerStatic();
		System.out.println(oi.isv);
		
		// ����Ŭ���� �ν��Ͻ�Ŭ���� ��üȭ
		Outer o = new Outer();
		Outer.InnerInstance ii = o.new InnerInstance();
		System.out.println(ii.iiv);
		
		o.f();
		
		System.out.println();
//		Ŭ����.��ü.�޼ҵ� ����
		
		Soldier s = new Soldier() { //�͸� Ŭ����, Soldier Ÿ������ �������̵� �Ȱ�
			// �̸��� �����Ƿ� ��ĳ���� �ص� �ڽĿ��� ���Ӱ� ������ ���� �� �� ����
			// �ٿ�ĳ���õ� �Ұ���
			// Soldier�� ��ӹ��� Ŭ����, ��ĳ�����Ͽ� �θ� �־��ְ� �ִ�
			// �̸��� ������ ���� ������ ��ȸ�����θ� ����ϱ� ���ؼ�
			int a;
			public void f() {
				System.out.println("�޼ҵ�");
			}
			@Override
			public void eat() {
				System.out.println("�����ǵ� eat");
			}
			@Override
			public void work() {
				System.out.println("�����ǵ� work");
			}
			@Override
			public void sleep() {
				System.out.println("�����ǵ� sleep");	
			}
		};
//		s.a = 10;
		s.eat(); // �ڽĿ��� ������ �Ͽ����Ƿ� ��� ����
		
		Car c = new Car() { //�͸� Ŭ���� �ʵ�, Car�� ��ӹ޴� Ŭ����
			@Override
			public void engineOn() {// �ڽĿ��� �����ǵ� �޼ҵ�
				System.out.println("��ư���� �õ� ��");
			}
			
			public void f() {//�ڽĿ��� ���Ӱ� ���ǵ� �޼ҵ�
				System.out.println("�ڽĿ��� �����ϴ� �޼ҵ�");
			}// ��ĳ���� �Ǿ��� ������ ��� �Ұ���			
		};
		
		c.name = "�ȳ�";
		c.go();
		c.engineOn();
		
		
		
		
		
	}
}
