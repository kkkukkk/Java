package day07;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
		// ����ڿ��� ���� 5���� �Է¹޾� ������ �迭�� ������� ���� �� ����϶�
		// ���� �Է� >>
		// ���� �Է� >>
		// ���� �Է� >>
		// ���� �Է� >>
		// ���� �Է� >>
		// {55, 10, 17, 90, 1}

		Scanner sc = new Scanner(System.in);
//		int[] ar = new int[5];
//		for (int i = 0; i < 5; i++) {
//			System.out.print("�����Է� >>> ");
//			ar[i] = sc.nextInt();
//		}
//		System.out.print("{");
//		for (int i = 0; i < ar.length; i++) {
//			if (i == ar.length - 1) {
//				System.out.print(ar[i]);
//			} else {
//				System.out.print(ar[i] + ", ");
//			}
//		}
//		System.out.println("}");
//
//		// �ش� �迭���� ���� ū ���� ����Ͻÿ�
//		// ���� ū �� :
//
//		int max = ar[0];
//		for (int i = 1; i < ar.length; i++) {
//			if (max < ar[i]) {
//				max = ar[i];
//			}
//		}
//		System.out.println("���� ū �� : " + max);
//
//		// �ش� �迭���� ���� ���� ���� ����Ͻÿ�
//		// ���� ������ :
//
//		int min = ar[0];
//		for (int i = 0; i < ar.length; i++) {
//			if (min > ar[i]) {
//				min = ar[i];
//			}
//		}
//		System.out.println("���� ���� �� : " + min);

		// ��������, ��������, ���������� ���ʷ� �Է¹޾� �迭�� �־��� ��
		// �ش� �л��� ��������� ����Ͻÿ�

		int[] ar2 = new int[3];
		// �迭�� ������ �ο��ϱ� ���� ����ϱ⵵ �Ѵ�
		String[] subjects = { "����", "����", "����" };
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(subjects[i] + " ���� �Է� >> ");
			ar2[i] = sc.nextInt();
		}
		int total = 0;
		for (int i = 0; i < ar2.length; i++) {
			total += ar2[i];
		}
		System.out.println("��� : " + total / 3.0);

	}
}
