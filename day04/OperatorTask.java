package day04;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ����ڿ��� �� ������ �Է� �޾�(���׷��̵�)
		// �� �� �� ū �� ����ϱ�, ���� ����� ���ٰ� ����ϱ�
		// �Է¿���
		// �����Է� >> 20
		// �����Է� >> 30
		// ��¿���
		// 30
		// 2. ������ �Է¹��� �� ������ ��(ū �� - ������) ���ϱ�
		// ��¿���
		// �� ���� ���� 10�Դϴ�
		System.out.println("�����Է� >> ");
		int a = sc.nextInt();
		System.out.println("�����Է� >> ");
		int b = sc.nextInt();
		String result = a>b ? Integer.toString(a) : a==b ? "����" : b+"";
		System.out.println(result);
		//System.out.println(a>b ? a : a==b ? "����" : b);
		int d = a>b ? a-b : b-a;
		System.out.println("�� ���� ���� " + d + "�Դϴ�");
		
		// 3. ����ڿ��� ���̸� �Է� �޾Ƽ�
		// ���̰� 10�� �̻�, 30�� ���϶�� 1500��
		// �� ���� ���̶�� ���� ��� ����ϱ�
		System.out.println("���� �Է� >> ");
		int age = sc.nextInt();
		//System.out.println(age <= 10 && age >= 30 ? "1500��" : "����");
		System.out.println(age < 10 || age > 30 ? "����" : "1500��");
		
		// 4. �� �ڽ��� 20���� ����� ����
		// ����� ������ �Է� �޾Ƽ�
		// �ʿ��� �ڽ� ������ ����ϴ� ���α׷�
		// �Է¿���
		// ��� ���� >> 31
		// ��¿���
		// �ʿ��� ���ڴ� 2���� �Դϴ�
		System.out.println("��� ���� >> ");
		int noodle = sc.nextInt();
		int box = noodle%20==0 ? noodle/20 : noodle/20 + 1;
		System.out.printf("�ʿ��� ���ڴ� %d���� �Դϴ�.\n", box);
		
		char target = 'A';
		String res = target >= 'A' && target <= 'Z' ? "�빮���Դϴ�." : "�빮�ڰ� �ƴմϴ�";
		System.out.println(res);
		// 5. target�� ����ִ� ���ڰ� �빮������ �Ǻ��ϴ� ���α׷�
		// target�� �빮�ڰ� ����ִٸ� �빮���Դϴ� ���
		// �빮�ڰ� �ƴ϶��, �빮�ڰ� �ƴմϴ� ���
		// hint �ƽ�Ű�ڵ�
	}
}
