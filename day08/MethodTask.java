package day08;

import java.util.Scanner;

public class MethodTask {
	//1. ����ڿ��� �̸��� �ݺ�Ƚ���� �Է¹޾Ƽ�
	// �ش� �̸��� �ش� Ƚ����ŭ �ݺ����ִ� �޼ҵ� �����
	public static void Names(int cnt, String name) {
		for(int i= 0; i < cnt ; i++) {
			System.out.println(name);
		}
	}
	
	//2. ����ڿ��� ���̸� �Է� �޾Ƽ� �������� �̼���������
	// �Ǵ��ϴ� �޼ҵ� �����
	
	public static boolean Ages(int age) {
		Scanner sc = new Scanner(System.in);
		if (age > 19) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//3. �迭�� �迭 ���ó�� ������ִ� �޼ҵ� �����
	public static void Arrays(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if ( i == array.length -1 ) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]+", ");
			}
		}
		System.out.println("}");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {4,5};
		MethodTask.Arrays(array);
		
		int[] ar2 = {1,5,6,7,8};
		MethodTask.Arrays(ar2);
		
		
//		System.out.print("���� �Է� >>> ");
//		int age = sc.nextInt();
//		if(MethodTask.Ages(age)) {
//			System.out.println("�����Դϴ�.");
//		}else {
//			System.out.println("�̼������Դϴ�.");
//		}
		
		
		
		
//		System.out.print("�̸� �Է� >>> ");
//		String n = sc.nextLine();
//		System.out.print("Ƚ�� �Է� >>> ");
//		int c = sc.nextInt();
//		
//		MethodTask.Names(c, n);
		
	}
}
