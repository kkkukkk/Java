package day14;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class MapTask {
	public static void main(String[] args) {
		// �޴��� ���� ���α׷�
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> menu = new HashMap<>();

		while (true) {
			System.out.println("1. �޴� �߰��ϱ�");
			System.out.println("2. �޴� �����ϱ�");
			System.out.println("3. �޴� �����ϱ�");
			System.out.println("4. ��ü �޴�����");
			System.out.println("5. ������");

			try {
				System.out.print(" ��ȣ ���� >>> ");
				int choice = Integer.parseInt(sc.nextLine());

				if (choice == 5) {
					break;
				} else if (choice == 1) {
					System.out.print("���� �Է� >> ");
					String food = sc.nextLine();
					System.out.print("���� �Է� >> ");
					int price = Integer.parseInt(sc.nextLine());
					// ��������� �����̸��� ������ �Է¹޾Ƽ�
					// �ش� �޴� �߰��ϱ�
					for (String a : menu.keySet()) {
						if (a.equals(food)) {
							System.out.println("������ �޴��� �����մϴ�");
							break;
						}
					}
					menu.put(food, price);
					// �ߺ� �� ��� �߰��Ǹ� �ȵ�

				} else if (choice == 2) {
					boolean check = false;
					System.out.print("������ ���� �Է� >> ");
					String food = sc.nextLine();
					// ����Կ��� ���� �̸��� ������ ������ �Է¹޾Ƽ�
					for (String a : menu.keySet()) {
						if (a.equals(food)) {
							System.out.print("������ ���� �Է� >> ");
							int price = Integer.parseInt(sc.nextLine());
							menu.put(food, price);
							check = true;
							break;
						}
					}
					if (check == false) {
						System.out.println("������ �������� �ʽ��ϴ�");
					}
					// �ش� �޴��� ���� �����ϱ�
					// �޴��� ������ ���� �Ұ���

				} else if (choice == 3) {
					// ����Կ��� ���� �̸��� �Է¹޾Ƽ�
					boolean check = false;
					System.out.print("������ ���� �Է� >> ");
					String food = sc.nextLine();
					// �ش� �޴� �����ϱ�
					for (String a : menu.keySet()) {
						if (a.equals(food)) {
							menu.remove(food);
							System.out.println(food + "�� �����߽��ϴ�");
							check = true;
							break;
						}
					}
					if (check == false) {
						System.out.println("������ �������� �ʽ��ϴ�");
					}
					// �޴��� ������ ���� �Ұ���

				} else if (choice == 4) {
					// -----ī��޴�-----
					// �Ƹ޸�ī�� : 1500��
					// ī��� : 2000��
					// ---------------
					// �޴��� ������� �޴��� ���� �����ϴ�.
					System.out.println("-----ī��޴�-----");
					for (Entry<String, Integer> a : menu.entrySet()) {
						System.out.println(a.getKey() + " : " + a.getValue());
					}
					System.out.println("----------------\n");

				} else {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}
			} catch (Exception e) {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}

		}

	}
}
