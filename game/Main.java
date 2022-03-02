package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ������ ���� ����
//		Animal test = new Animal(10,10);
//		test.rest();
//		Dog d = new Dog(50,20);
//		d.rest();

		Scanner sc = new Scanner(System.in);

		Animal avatar = null;

		System.out.println("ĳ���͸� �����Ͻÿ�");
		System.out.println("1. ������");
		System.out.println("2. ȣ����");
		System.out.println("3. �����");
		System.out.println("(���� �ش� ���ڸ� �����ϸ� �������� ���õ˴ϴ�)");
		int choice = sc.nextInt();

		if (choice == 2) {
			// Tiger Ÿ���� ��ü�� ��ĳ����
			avatar = new Tiger(50, 50);
		} else if (choice == 3) {
			// Cat Ÿ���� ��ü�� ��ĳ����
			avatar = new Cat(50, 50);
		} else {
			// Dog Ÿ���� ��ü�� ��ĳ����
			avatar = new Dog(50, 50);
		}

		System.out.println("--���� ����--");
		while (true) {
			System.out.println("1.�Ա�");
			System.out.println("2.��å����");
			System.out.println("3.���ڱ�");
			System.out.println("4.��������");
			choice = sc.nextInt();

			if (choice == 4) {
				break;
			} else if (choice == 1) {
				// �ڽ�Ÿ�Կ� �����ǵ� eat()�� �����
				avatar.eat();
			} else if (choice == 2) {
				// �ڽ�Ÿ�Կ� �����ǵ� walk() �����
				avatar.walk();
			} else if (choice == 3) {
				// �ڽ�Ÿ�Կ� �����ǵ� rest() �����
				avatar.rest();
			} else {
				System.out.println("�߸��Է��߽��ϴ�.");
			}
		}

//		avatar.onlyTiger(); ��ĳ������ �Ǹ� �ڽĿ��� ���Ӱ� ���� �޼ҵ�� ����� �� ����.

		if (avatar instanceof Tiger) {// �ٿ�ĳ���� ���� Ÿ�� Ȯ��
			Tiger t = (Tiger) avatar; // �ٿ�ĳ����
			t.onlyTiger();
		}

	}
}
