package castingTest;

public class Main {
	// ���� ��ü�� ������ ��� �����Դϴ� ��� ����ϴ� �޼ҵ�
	public static void isAnimal(Animal target) {
		target.cry();
		if(target instanceof Eagle) {
			Eagle e = (Eagle)target;
			e.fly();		
		}
		System.out.println("�����Դϴ�");
	}
	public static void main(String[] args) {
		Pig p = new Pig();
		Cat c = new Cat();
		Eagle e = new Eagle();
//		System.out.println(p instanceof Cat);
		Main.isAnimal(p);
		Main.isAnimal(c);
		Main.isAnimal(e);
		
		Animal a = new Animal();
		Test t = new Test();
		String str = "�ȳ�";
		
		Object[] ar = {a, t, p, c, e, str};
		
		
		
		
	}
}
