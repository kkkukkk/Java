package day07;

import java.util.Scanner;

public class DoubleArrayTask {
	public static void main(String[] args) {
		// ���� ���� ���α׷�
		Scanner sc = new Scanner(System.in);
		// 1. �ϰ� ���� ����
		// 2. ���� ���� ���� ���
		// 3. ������

		int[][] house = {
				// 1ȣ 2ȣ 3ȣ
				/* 1�� */ { 10, 20, 30 },
				/* 2�� */ { 100, 200, 300 } };

		while (true) {
			System.out.println("1. ���� ���� ����");
			System.out.println("2. ���� ���� ���� ���");
			System.out.println("3. ������ ���� ����");
			System.out.println("4. ������");
			int choice = sc.nextInt();
			
			if (choice == 4) {
				break;
			} else if (choice == 1) {
				// ����ڿ��� ���� ȣ���� �Է� �޾Ƽ�
				System.out.print("�� �Է� >> ");
				int floor = sc.nextInt(); // 1(��)
				System.out.print("ȣ�� �Է� >> ");
				int ho = sc.nextInt(); // 1(ȣ)
				// �迭�� �˸��� �濡 ������ �������ش�
				System.out.print("���� ���� >> ");
				house[floor - 1][ho - 1] = sc.nextInt();

				System.out.println("���� �Ϸ�!");

			} else if (choice == 2) {
				// ������ ���� ���� ���� �����ؼ�
				System.out.print("�� �Է� >> ");
				int floor = sc.nextInt();
				// ���� �� ���� �����ش�
				int total = 0;
				for (int fee : house[floor - 1]) {
					total += fee;
				}
				System.out.println(floor + "�� ���� �� ��: " + total);

			} else if (choice == 3) {
				// 1�� 1ȣ : 00����
				// 1�� 2ȣ : 00����
				// 1�� 3ȣ : 00����
				// 2�� 1ȣ : 00����
				// 2�� 2ȣ : 00����
				// 2�� 3ȣ : 00����
				// house.length : 2
				for (int i = 0; i < house.length; i++) {
					// house[0].length : 3
					// house[1].length : 3
					for (int j = 0; j < house[i].length; j++) {
						System.out.println((i + 1) + "��" + (j + 1) + "ȣ : " + house[i][j]);
					}
				}

			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}

	}
}
