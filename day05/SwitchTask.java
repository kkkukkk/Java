package day05;

import java.util.Scanner;

public class SwitchTask {
	public static void main(String[] args) {
		// 1. ����ڿ��� ���� �Է¹޾Ƽ� �ش� ���� ������ �� �˷��ֱ�
		// (2���� 28���̶�� �����Ѵ�), �߸��� �� �Է½� �߸��� ���Դϴ� ����ϱ�
		// ex 5
		// �Է��Ͻ� ���� ������ ���� 31���Դϴ�
		Scanner sc = new Scanner(System.in);
//		System.out.print("�� �Է� >> ");
//		int month = sc.nextInt();
//		int day = 0;
//		switch (month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println("�Է��Ͻ� ���� ������ ���� 31�� �Դϴ�");
//			break;
//		case 1, 3, 5, 7, 8, 10, 12:
//			day = 31;
//			break;
//		case 4, 6, 9, 11:
//			day = 30;
//			break;
//		case 2:
//			day = 28;
//			break;
//		default:
//			System.out.println("�߸��� ���Դϴ�");
//		}
//		// �߸��Է��� ��쿡�� ��� �ȵǰ� �����
//		// �߸� �Է��� ��쿡�� switch���� ���� ��쿡�� day�� 0�� ����ִ�
//		if (day != 0) {//�߸� �Է����� �ʾҴٸ�
//			System.out.println("�Է��Ͻ� ���� ������ ���� " + day + "�� �Դϴ�");
//		}
//		if (month >= 1 && month <= 12) {
//			System.out.println("�Է��Ͻ� ���� ������ ���� " + day + "�� �Դϴ�");
//		}

		// 2.����ڿ��� ����(int)�� �Է¹޾�
		// 90�̻� 100���� : ����� ������ A�Դϴ�
		// 80�̻� 90�̸� : ����� ������ B�Դϴ�
		// 70�̻� 80�̸� : ����� ������ C�Դϴ�
		// 70�̸� : ����� ������ F�Դϴ�
		System.out.print("���� >> ");
		int score = sc.nextInt();
		String grade = "";
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default:
			grade = "F";
		}

		System.out.println("����� ������ " + grade + "�Դϴ�");

	}
}
