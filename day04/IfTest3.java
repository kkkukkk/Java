package day04;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		// ����ڿ��� �Է��� �޾Ƽ�, �ش� ������ 3�� ������ 3�� ����Դϴ�
		// 4�� ������ 4�� ����Դϴٸ� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 3 == 0) {
			System.out.println("3�� ����Դϴ�");
		}
		if (n % 4 == 0) {
			System.out.println("4�� ����Դϴ�");
		}

//		int num = 5;
//		if (num <= 10) {
//			System.out.println("10���� �۾ƿ�");
//		}
//		if (num == 5) {
//			System.out.println("num�� 5�Դϴ�");
//		}
	}
}
