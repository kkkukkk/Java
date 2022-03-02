package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ȸ�� 1�� ���� 4���� ��(�̸�,����,���̵�,��й�ȣ)��
		// User Ÿ���� ��ü�� ����ش�.

		// �������� User Ÿ���� ��ü�� ArrayList�� �����ϰڴ�.
		ArrayList<User> list = new ArrayList<User>(); // ȸ�������� ����� ����Ʈ

		while (true) {
			System.out.println("1.ȸ������");
			System.out.println("2.�α���");
			System.out.println("3.ȸ����������");
			System.out.println("4.������");
			
			System.out.print("��ȣ���� >> ");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 4) {
				break;
			} else if (choice == 1) {

				boolean check = false; // flag ����

				System.out.print("�̸� �Է� >> ");
				String name = sc.nextLine();

				System.out.print("���� �Է� >> ");
				int age = Integer.parseInt(sc.nextLine());

				System.out.print("id �Է� >> ");
				String id = sc.nextLine();

				for (User user : list) {
					if (user.id.equals(id)) {
						// id�� �ߺ��ȴٴ� �ǹ�
						check = true;
						break;
					}
				}


				if (check == false) {
					User u = new User(); // ȸ�� 1�� ���� ������ ������ ��ü
					
					u.name = name;
					u.age = age;
					u.id = id;
					
					System.out.print("pw �Է� >> ");
					u.pw = sc.nextLine();

					list.add(u);
					System.out.println("ȸ������ ����");
				} else {
					System.out.println("�ߺ��� ���̵� �����մϴ�");
				}

			} else if (choice == 2) { // �α���
				boolean check = false;
				
				// ���̵�� ��й�ȣ�� �Է� �ް�
				System.out.print("id >> ");
				String id = sc.nextLine();
				System.out.print("pw >> ");
				String pw = sc.nextLine();
				
				// ȸ�����Ե� ������ �Է¹��� ���̵�� ��й�ȣ�� ��ġ�Ѵٸ�
				for (User u : list) {
					if(u.id.equals(id) && u.pw.equals(pw)) {
						System.out.println(u.name+"�� ȯ���մϴ� �α��� �Ǿ����ϴ�");
						check = true;
						break;
					}
				}
				
				if(check == false) {					
					System.out.println("�α��� ����");
				}
				// 000�� ȯ���մϴ� �α��� �Ǿ����ϴ�.(�α��� ����)
				// �װ� �ƴ϶�� ��й�ȣ�� ���̵� Ȯ�����ּ��� ���(�α��� ����)

			} else if (choice == 3) {
				System.out.println(" id >> ");
				String id = sc.nextLine();
				boolean check = false;
				for (User user : list) {
					if(user.id.equals(id)) {
						check = true;
						System.out.println("---ȸ������---");
						System.out.println("�̸�: " + user.name);
						System.out.println("����: " + user.age);
						System.out.println("id: " + user.id);
						System.out.println("pw: " + user.pw);
						break;
					}	
				}
				if(check == false) { 
					System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
				}
				
			} else {
				System.out.println("�߸� �Է��߽��ϴ�");
			}

		}
	}
}
