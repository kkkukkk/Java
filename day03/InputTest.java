package day03;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		//���̸� �Է¹ް�, �̸��� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		/*System.out.println("���� �Է� >> ");
		int age = scan.nextInt(); //�������� ���ڰ��� ������ �� �־ \n(enter)�� ���ۿ� ����
		scan.nextLine(); //���ۿ� �����ִ� ���� �޾Ƽ� �����
		System.out.println("�̸� �Է� >> ");
		String name = scan.nextLine();
		System.out.printf("���� : %d, �̸� : %s\n", age, name);*/
		
		// 1. ���̸� �Է¹޴´�
		// 2. �̸��� �Է¹޴´�
		// 000���� ���̴� 00���Դϴ�. ��, ���̴� nextInt()
		// �̸��� enxtLine()�� ����Ұ�
		System.out.println("���� �Է� >> ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("�̸� �Է� >> ");
		String name1 = scan.nextLine();
		System.out.printf("%s���� ���̴� %d���Դϴ�.\n", name1, age);
		
		// 1. Ű�� �Է¹޴´�
		// 2. �̸��� �Է¹޴´�
		// 000���� Ű�� 00.00cm�Դϴ�. ��, Ű�� nextDouble()
		// �̸��� nextLine()�� ����� ��
		System.out.println("Ű �Է� >> ");
		double height = scan.nextDouble();
		scan.nextLine();
		System.out.println("�̸� �Է� >> ");
		String name2 = scan.nextLine();
		System.out.printf("%s���� Ű�� %.2fcm�Դϴ�.\n", name2, height);
		
		// 1. �̸��� �Է¹޴´�
		// 2. �ּҸ� �Է¹޴´�
		// 000�� 000 000�� ���� ���Դϴ�. ��, �̸��� next()
		// �ּҴ� nextLine()�� ����Ұ�
		System.out.println("�̸� �Է� >> ");
		String name3 = scan.next();
		scan.nextLine();
		System.out.println("�ּ� �Է� >> ");
		String addr = scan.nextLine();
		System.out.printf("%s�� %s�� �������Դϴ�.\n", name3, addr);
		
		
	}
}
