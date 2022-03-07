package day15;

import java.util.HashMap;
import java.util.Scanner;

public class MapTask {
	// key���� �ش� �ؽøʿ� �����ϴ��� ���ϴ��� �Ǵ��ϴ� �޼ҵ�
	// continsKey() --> key���� �ʿ� �����ϸ� true, �ƴϸ� false
	public static boolean containsKey(HashMap<String, Integer> map, String key) {
		for(String temp : map.keySet()) {
			if(temp.equals(key)) {
				// �ߺ��� key�� �����Ѵٴ� �ǹ�
				return true;
			}
		}
		
		return false;	
		
	}
	
	
	
	
	public static void main(String[] args) {
		// ī�� �޴��� ���� ���α׷�
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> menu = new HashMap<String, Integer>();

		while (true) {
			System.out.println("1. �޴� �߰��ϱ�");
			System.out.println("2. �޴� �����ϱ�");
			System.out.println("3. �޴� �����ϱ�");
			System.out.println("4. ��ü �޴�����");
			System.out.println("5. ������");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 5) {
				break;
			} else if (choice == 1) {
				// ��������� ���� �̸��� ������ �Է� �޾Ƽ�
				System.out.print("�߰��� �޴� : ");
				String name = sc.nextLine();
				
				
//				boolean check = false;
//				
//				for(String key :menu.keySet()) {
//					if(key.equals(name)) {
//						// �ߺ��� Ű���� �����Ѵٴ� �ǹ�
//						check = true;
//						break;
//					}
//				}
				
//				if(check) {
//					System.out.println("�ش� �޴��� �̹� �����մϴ�");
//					continue;
//				}
				
				if(MapTask.containsKey(menu, name)) {
					System.out.println("�ش� �޴��� �̹� �����մϴ�");
					continue;
				}
				// �ش� �޴� �߰��ϱ�
				System.out.print("���� : ");
				int price = Integer.parseInt(sc.nextLine());
				
				menu.put(name, price);
				
				System.out.println("�߰� ����!");
				
				
			} else if (choice == 2) {
				// ����Կ��� ���� �̸��� ������ ������ �Է� �޾Ƽ�
				System.out.print("������ �޴� : ");
				String name = sc.nextLine();
				
				if(MapTask.containsKey(menu, name)) {
					System.out.println("������ ���� : ");
					int price = Integer.parseInt(sc.nextLine());
					
					menu.put(name, price);
				}else {
					System.out.println("�ش� �޴��� �������� �ʽ��ϴ�");
				}
				
				
				// �ش� �޴��� ���� �����ϱ�
			} else if (choice == 3) {
				// ����Կ��� ���� �̸��� �Է� �޾Ƽ�
				System.out.print("�޴� �Է� >> ");
				String name = sc.nextLine();
				// �ش� �޴� �����ϱ�
				
				if(menu.containsKey(name)) {
					menu.remove(name);
					System.out.println("��������!");
				}else {
					System.out.println("�������� �ʴ� �޴��Դϴ�");
				}
				
			} else if (choice == 4) {
				// -----ī��޴�-----
				System.out.println("----ī��޴�----");
				for(String key : menu.keySet()) {
					// �Ƹ޸�ī�� : 1500��
					// ī����� : 2000��
					System.out.println(key + " : " + menu.get(key));
				}
				// ----------------
				System.out.println("--------------");
			} else {
				System.out.println("�߸��Է��߽��ϴ�");
			}

		}
		
		
		
		
		
		
		

	}
}
