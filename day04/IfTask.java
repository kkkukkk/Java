package day04;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		// ����ڿ��� ������ �Է¹޾�(int�� �Է�)
		// ������ 90�� �̻��̸� A����
		// 80�̻�, 90�̸��̸� B����
		// 70�̻�, 80�̸��̸� C����
		// 70�̸� F����
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� >> ");
		int score = sc.nextInt();
		/*
		 * if (score > 100 || score < 0) { System.out.println("�߸��������Դϴ�"); } else
		 */

		String res = "";
		if (score >= 90) {
//			System.out.print("A����");
			res = "A����";
		} else if (score >= 80) {
//			System.out.print("B����");
			res = "B����";
		} else if (score >= 70) {
//			System.out.print("C����");
			res = "C����";
		} else {
//			System.out.print("F����");
			res = "F����";
		}

		// �ϰ� ó��
		System.out.println("����� ������ " + res + "�Դϴ�");

	}
}
