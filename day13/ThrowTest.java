package day13;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է� >> ");
		int num = sc.nextInt();

		if (num == 1) {
			try {
				throw new ArithmeticException("1�� �Էµ�");
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("���� �Էµ�");
	}
}
