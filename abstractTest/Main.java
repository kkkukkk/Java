package abstractTest;

public class Main {
	public static void main(String[] args) {
		//�߻� Ŭ������ �ʵ����� �̱����� ���°� �����ϱ� ������
		//��üȭ�� �Ұ����ϴ�
//		Parent p = new Parent();
		Child c = new Child();
		c.a = 100;
		c.f1();
		c.f2();
		c.rest();
		
		// �߻�Ŭ���� ��üȭ�� �ƴ�,
		// �ڽ� ��ü�� �θ�Ÿ������ ��ĳ���� �� ��
		Parent p = new Child();
		p.f2();
		
	}
}
