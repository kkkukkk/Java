package day10;

// SuperCar : �ڽ�Ŭ����, Car: �θ�Ŭ����
public class SuperCar extends Car{
	String mode;
	
	public SuperCar() {
		// �θ������ ȣ��
		super(); // �θ������
		System.out.println("SuperCar ��ü ������");
	}
	
	@Override
	public void show() {
//		System.out.println("----��������----");
//		System.out.println("���� : " + this.name);
//		System.out.println("���� : " + this.price +"����");
//		System.out.println("���� : " + this.color);
		// super : �θ� �ǹ��ϴ� Ű����
		super.show(); // �θ� �����ϴ� �޼ҵ带 ȣ���Ͽ� �ڽĿ��� ����� �� �ִ�
		System.out.println("��� : " + this.mode );
	}
	// SuperCarŬ������ Car Ŭ������ ��ӹ޾ұ� ������
	// CarŬ������ �����ϴ� ������� �����Ӱ� ����� �� �ִ�.
	public void openRoof() {
		System.out.println("������ �������ϴ�");
	}
	
	// �޼ҵ� ���� ���̵�(over riding) : ������
	// �θ�Ŭ������ �����ϴ� �޼ҵ带 ���� �̸����� �ڽ�Ŭ�������� ������ �ϴ°�
	@Override // ������̼� �ּ�
	public void engineOn() {
		System.out.println("��ư���� �õ� �׽��ϴ�.");
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
	
}
