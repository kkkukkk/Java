package day05;

public class SwitchTest {
	public static void main(String[] args) {
		int num = 5;
		// ctrl + alt + ���Ʒ�ȭ��ǥ : ����
		// alt + ���Ʒ�ȭ��ǥ : �̵�
		System.out.println("---if---");
		if (num == 5) {
			System.out.println("5�Դϴ�");
		} else if (num == 1) {
			System.out.println("1�Դϴ�");
		} else {
			System.out.println("�׿��Դϴ�");
		}

		System.out.println("---switch---");
		switch (num) {
		case 5:// num == 5
			System.out.println("5�Դϴ�");
			break;
		case 1:// num == 1
			System.out.println("1�Դϴ�");
			break;
		default://���� ��� �����϶�
			System.out.println("�׿��Դϴ�");
//			break;
		}

	}
}
