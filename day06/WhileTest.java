package day06;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("for�� ���ʹ���");
		}
		System.out.println("for�� �ٱ�����");
		
		System.out.println("------------------------");
		
		int num = 0;
		while(num<3) {
			System.out.println("while�� ���ʹ���");
			num++;
		}
		System.out.println("while�� �ٱ�����");
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("1.�����ϱ� 2.�۱��ϱ� 3.������");
//			int choice = sc.nextInt();
//			if(choice == 3) {
//				break; // ��� �ݺ��� ����(Ż��)�Ѵ�
//			}
//		}
		
//		int choice = 0;
//		while(choice != 3) {
//			System.out.println("1.�����ϱ� 2.�۱��ϱ� 3.������");
//			choice = sc.nextInt();
//			
//		}
		
		int choice = 0;
		do{
			System.out.println("1.�����ϱ� 2.�۱��ϱ� 0.������");
			choice = sc.nextInt();
		}while(choice != 0);
		
		
	}
}
