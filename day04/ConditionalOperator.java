package day04;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		System.out.println(true ? "��" : 5);
		System.out.println(false ? "��" : 5);
		
		// ����ڿ��� ���̸� �Է� �޾Ƽ�
		// ���ο��θ� �Ǵ��ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� >>");
		int age = sc.nextInt();
		
		System.out.println(age > 19 ? "����" : "�̼�����");
		
		
		
		
	}
}
