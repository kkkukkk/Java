package interTest;

public class Main {
	public static void main(String[] args) {
		// final : ������ ���ȭ�� �����ϴ� ������
		final int num;
		num = 10; // �ʱ�ȭ�� ������ ���ȭ �Ǿ� �ٸ� ���� ������ �� ����
//		num = 50;
//		num = 60
		
		System.out.println(Soldier.num);
//		Soldier.num = 15;
		
//		Soldier s = new Soldier(); �������̽��� ��üȭ �Ұ���
									// �̱����� �޼ҵ尡 �ֱ� ������
		
		SecondMan s = new SecondMan();
		s.eat();
		
		Corporal c = new Corporal();
		c.eat();
		
		Soldier s1 = new SecondMan();
		s1.eat();
		Soldier s2 = new Corporal();
		s2.eat();
		
		
		
		
		
		
		
	}
}
