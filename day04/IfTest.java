package day04;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		// ����ڿ��� ���� �Ѱ��� �Է� �޾�
		// ¦����� ¦���Դϴ� ����ϱ�
		// Ȧ����� Ȧ���Դϴ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� >> ");
		int a = sc.nextInt();
		
		System.out.println(a%2==0 ? "¦���Դϴ�" : "Ȧ���Դϴ�");
		
		if(a%2==0){
			System.out.println("¦���Դϴ�");
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
		
		
//		if(a%2==1){
//			System.out.println("Ȧ���Դϴ�");
//		}
		
	}
}


