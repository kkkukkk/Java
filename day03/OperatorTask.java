package day03;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {
		// 1. ����ڿ��� ������ �Է¹ް�, �ش� ������ �����ڸ��� �����ڸ��� ����϶�
		// �Է¿���
		// ���� �Է� >> 95
		// ��¿���
		// �����ڸ� : 9
		// �����ڸ� : 5
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� >> ");
		int num = scan.nextInt();
		int num1 = num/10;
		int num2 = num%10;
		//System.out.printf("�����ڸ� : %d\n�����ڸ� : %d\n", num1, num2);
		System.out.println("�����ڸ� : " + num1);
		System.out.println("�����ڸ� : " + num2);
		// 2. �뷡 �� ��� 300���� ���γ뷡���� �ִ�
		// ����ڿ��� �ݾ��� �Է� �ް�, �θ� �� �ִ� �뷡�� �ܵ��� ����϶�
		// �Է¿���
		// �ݾ� �Է� >> 2000
		// ��¿��� 
		// �θ� �� �ִ� �뷡�� 6���̸�, 200���� ��ȯ�Ǿ����ϴ�.
		
		System.out.println("�ݾ� �Է� >> ");
		int price = scan.nextInt();
		int cost = 300;
		
		int song = price/cost;
		int rest = price%cost;
		
		//System.out.printf("�θ� �� �ִ� �뷡�� %d���̸�, %d���� ��ȯ�Ǿ����ϴ�.\n", song, rest);
		System.out.println("�θ� �� �ִ� �뷡�� "+song+"���̸�, "+rest+"���� ��ȯ�Ǿ����ϴ�");
		// 3. ����ڿ��� ��������, ���������� �Է� �޾� ����� ����϶�
		// �������� >> 80
		// �������� >> 81
		// ����� ����� 80.5�� �Դϴ�.
		
		System.out.println("�������� >> ");
		double kor = scan.nextDouble();
		scan.nextLine();
		System.out.println("�������� >> ");
		double math = scan.nextDouble();
		double avg = (kor+math)/2;
		System.out.printf("����� ����� %.1f�� �Դϴ�.\n", avg);
//		System.out.printf("����� ����� " + (double)(kor+math)/2 + "�� �Դϴ�.");
	}
}

