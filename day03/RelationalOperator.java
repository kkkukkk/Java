package day03;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		System.out.println(10 > 2); // true
		System.out.println(10 > 20);// false
		
		System.out.println('a' >= 5); // true
		System.out.println('b' >= 'a'); // true
		
//		System.out.println("�ȳ�" >= "�ݰ����ϴ�"); ���ڿ��� �� �Ұ�
		System.out.println(10 == 10); // true
		// ���ڿ��� ������ �񱳴� �޼ҵ带 ���ؼ� ���ش�
		// ���ڿ�1.equals(���ڿ�2) --> �� ���ڿ��� ���ٸ� true, �ƴϸ� false
		System.out.println("�ȳ�".equals("�ȳ�"));
		System.out.println("�ȳ�".equals("�ݰ���"));
		
		// ����ڿ��� id�� �Է� �޾Ƽ� id�� admin�̶�� true, 
		// �ƴϸ� false�� ����϶�
		Scanner sc = new Scanner(System.in);
		System.out.println("id >> ");
		String id = sc.nextLine();
		
		System.out.println(id.equals("admin"));
		//System.out.println("admin".equals(id)); ������ ����	
	}
}
