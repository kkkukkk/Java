package collectionTest;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ȸ�� 1�� ���� 4���� ��(�̸�,����,���̵�,��й�ȣ)��
		// User Ÿ���� ��ü�� ����ش�.
		
		// �������� User Ÿ���� ��ü�� ArrayList�� �����ϰڴ�.
		ArrayList<User> list = new ArrayList<User>(); //ȸ�������� ����� ����Ʈ
		
		
		while(true) {
			System.out.println("1.ȸ������");
			System.out.println("2.�α���");
			System.out.println("3.ȸ����������");
			System.out.println("4.������");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 4) {
				break;
			}else if(choice == 1) {
				User u = new User(); // ȸ�� 1�� ���� ������ ������ ��ü
				
				System.out.print("�̸� �Է� >> ");
				u.name = sc.nextLine();
				
				System.out.print("���� �Է� >> ");
				u.age = Integer.parseInt(sc.nextLine());
				
				System.out.print("id �Է� >> ");
				u.id = sc.nextLine();
				
				System.out.print("pw �Է� >> ");
				u.pw = sc.nextLine();
				
				list.add(u);
				
				
			}else if(choice == 2) {
				
			}else if(choice == 3) {
				
			}else {	
				System.out.println("�߸� �Է��߽��ϴ�");
			}
			
			
		}
	}
}
