package game;

import java.util.Iterator;

public class Tiger extends Animal {

	public Tiger(int hp, int feed) {
		super(hp, feed);
	}
	
	//eat()
	public void eat() {
		this.feed -= 4;
		super.eat();
	}
	
	
	//walk() �θ� �޼ҵ� ���
	
	//rest()
	@Override
	public void rest() {
		System.out.println("ȣ���� �޽���");
		for (int i = 0; i < 10;i++) {
			System.out.println("!");
		}
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	System.out.println();
	this.hp += 20;
	this.feed += 20;
	this.show();
	
	}
	
	// Tiger Ŭ���� �ȿ��� �����ϴ� �޼ҵ�
	
	public void onlyTiger() {
		System.out.println("�������");
	}
	
}
