package castingTest;

public class Animal {
	
	public void cry() {
		System.out.println("���� �����Ҹ�");
	}
}

class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("�ܲ�");
	}
	public void eat() {
		System.out.println("�ȳ� ���ִ�");
	}
}

class Cat extends Animal{
	@Override
	public void cry() {
		System.out.println("�߿˾߿�");
	}
	public void punch() {
		System.out.println("�ɳ���ġ");
	}
}

class Eagle extends Animal {
	@Override
	public void cry() {
		System.out.println("�������� ��� �־��");
	}
	
	public void fly() {
		System.out.println("�ϴ��� ���� �־��");
	}
}