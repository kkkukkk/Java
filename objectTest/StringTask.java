package objectTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ��й�ȣ ��ȣȭ
		
		final int KEY = 3;
		
		System.out.println("��й�ȣ �Է� : ");
		String pw = sc.nextLine();
		String en_pw = "";
		
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i) * KEY);
		}
		System.out.println("��ȣȭ�� pw : " + en_pw);
		System.out.println("-----------------------");
		// ��ȣȭ�� ��й�ȣ�� ��ȣȭ �Ͽ� ����ϱ�
		
		String or_pw = "";
		
		for (int i = 0; i < en_pw.length(); i++) {
			or_pw += (char)(en_pw.charAt(i) / KEY);	
		}
		System.out.println("��ȣ�� pw : " + or_pw);
		
		
		// ����ڿ��� ��ȭ��ȣ�� �Է¹ް�, �ش� ��ȭ��ȣ����
		// - �� ���� ���� ����϶�
		// 010-0000-0000 --> 01000000000

		System.out.println("��ȭ��ȣ �Է� >>> ");
		String pn = sc.nextLine();
		
//		String[] pn_n = pn.split("-");
//		String pn_nn = String.join("", pn_n);
		
		pn = pn.replaceAll("-", "");
		
		System.out.println(pn);
		
		// ����ڿ��� ȸ�������� �Է¹޴´�(�޸��� ���� �����Ͽ� �Է¹޴´�)
		// 10,���,�����
		// ---����� ����---
		// �̸� : ���
		// ���� : 10��
		// �ּ� : �����
		
		System.out.println("����� ���� �Է�(����,�̸�,�ּ�) >>> ");
		String info = sc.nextLine();
		String[] s_info = info.split(",");

		System.out.println("---����� ����----");
		System.out.println("�̸� : " + s_info[1]);
		System.out.println("���� : " + s_info[0]);
		System.out.println("�ּ� : " + s_info[2]);
		
		// ����ڿ��� �ѱ۷� ���ڸ� �Է� �ް�, �ش� �ѱ��� ���ڷ� �������ִ� ���α׷�
		
		System.out.print("�Է� >> ");
		String input = sc.nextLine();
		String res = "";
		String hangeul = "�����̻�����ĥ�ȱ�";
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			res += hangeul.indexOf(ch);
		}
		System.out.println(res);
		
	}
}
