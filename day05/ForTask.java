package day05;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 10 9 8 7 ... 1 ����ϱ�

		System.out.println();
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("--1���� �Է¹��� ���ڱ��� ���ϱ�--");
		// 1���� �Է¹��� ���ڱ��� ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �����ٱ�� >> ");
		int target = sc.nextInt();

		int k = 1;
		for (int i = 0; i < target; i++) {
			k += i + 1;
		}
		System.out.println("���� = " + (k - 1));

		k = target * (target + 1) / 2;
		System.out.println("���� = " + k);

		System.out.println("--1���� 100������ ���� �� ¦���� ����ϱ�--");
		// 1���� 100������ ���� �� ¦���� ����ϱ�
		
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				continue; // �ݺ����ȿ��� ���Ǹ� ��� �����ݺ����� �̵��Ѵ�
//				System.out.println("�ȳ�"); dead code
			}
			System.out.println(i + " ");
		}

		// ----3��----
		// 3 x 1 = 3
		// 3 x 2 = 6
		// 3 x 9 = 9
		// ...
		// 3 x 4 = 270
		System.out.println("--������ 3�� ����ϱ�--");
		System.out.println();
		
		System.out.println("�� ���� ����ұ��?");
		int x = sc.nextInt();
		System.out.println("�� ���� ����ұ��?");
		int y = sc.nextInt();
		for (int i = 1; i < y+1; i++) {
			System.out.println(x + "x" + i + "=" + x * i);
		}
		
			

	}
}
