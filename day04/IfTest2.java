package day04;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ����ڿ��� �� ������ �Է� �޾�(���׷��̵�)
		// �� �� �� ū �� ����ϱ� �Ѵ� ���� �� ��� ���� �� ����ϱ�
		// �Է¿���
		// �����Է� >> 20
		// �����Է� >> 30
		System.out.print("�����Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�����Է� >> ");
		int num2 = sc.nextInt();
		// ��¿���
		// 30
		System.out.println("---���׿�����---");
		String result = num1 > num2 ? Integer.toString(num1) : num1 == num2 ? "����" : num2 + "";
		System.out.println(result);

		// �ڵ� �ٸ��� : ctrl + shift + f

		System.out.println("---if��---");
		if (num1 > num2) {
			System.out.println("����");
		} else if (num1 == num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			// num1 <= num2 ������ ����
			System.out.println("�� ������ ����� �� �ִ�");
			if (num1 == num2) {
				System.out.println("����");
			} else {
				System.out.println(num2);
			}
		}

	}
}
