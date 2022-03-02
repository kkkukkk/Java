package game;

public class Dog extends Animal{

	public Dog(int hp, int feed) {
		super(hp, feed);
	}
	
	// eat() : �θ� ���ǵ� �޼ҵ� �״�� ���
	// walk()
	public void walk() {
		this.hp -= 4;
		super.walk();
	}
	
	// rest()
	@Override
	public void rest() {
		System.out.print("������ �޽���");
		for (int i = 0; i < 5; i++) {
			System.out.print("!�۸�");
			try {
				// try - catch ����Ű
				// �巡�� > alt+shift+z > �Ʒ�ȭ��ǥ > ����
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println();
		this.feed += 20;
		this.hp += 20;
		this.show();
	}
	
}
