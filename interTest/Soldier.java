package interTest;

public interface Soldier {
	// ������ �߻� �޼ҵ常 ���� �� �ִ�
//	public void f() {
//		�������̽����� �Ϲ� ������ �޼ҵ�� ���� �� ����
//	}
	
	// �������̽� �ȿ��� ������ static final ������ ������ �� �ְ�,
	// �ʱ�ȭ�� �ؾ� �Ѵ�
	static final int num = 10;
	
	public abstract void eat();
	public void work(); // ��¥�� �߻� �޼ҵ�ۿ� ���� �� ���� ������
						// abstract�� ���� �����ϴ�.
	public void sleep();
	
	
	
	
	
	
	
}
