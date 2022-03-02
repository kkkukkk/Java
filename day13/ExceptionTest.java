package day13;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = { 10, 20, 30 };
		// ����ڿ��� �ε��� ��ȣ�� ������ �Է¹ް�,
		// �ش� �ε��� ��ȣ�� �����ϴ� ���� �Է��� ������ ���� ���� ���

		System.out.println("�ε��� : ");
		int idx = sc.nextInt();
		System.out.println("���� �� : ");
		int num = sc.nextInt();

		try {
			System.out.println("��� : " + ar[idx] / num);
		} catch (ArrayIndexOutOfBoundsException e) {
			// ���ܰ�ü(e)�� �߻��� ���ܿ� ���� ������ ���� �ִ�
			// ���� �߻��� ���ܿ� ���ؼ� �˰� ���� ��
			// �ش� ��ü �ȿ� �ִ� �޼ҵ带 ����� �� �ִ�.
			// printStackTrace() : �߻��� ���� �̸��� ����ϴ� �޼ҵ�
			// getMessage() : �߻��� ������ �ο������� ���ڿ��� return �ϴ� �޼ҵ�
			System.out.println("�ε��� ��ȣ�� 0,1,2�� �����մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		} catch (InputMismatchException e) {
			System.out.println("���� �߻���");
		} finally {
			System.out.println("���ܰ� �߻� �ϵ� ���ϵ� ������ ����");
		}

		System.out.println("���α׷� ���������� �����");

		
		
		
	}
}
